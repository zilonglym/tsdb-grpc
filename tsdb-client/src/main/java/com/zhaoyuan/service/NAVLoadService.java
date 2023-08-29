package com.zhaoyuan.service;

import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import com.zhaoyuan.proto.auto.BlobDLL;
import com.zhaoyuan.proto.auto.TSDBRequest;
import com.zhaoyuan.proto.auto.TSDBResponse;
import com.zhaoyuan.proto.auto.TSDBServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class NAVLoadService implements ApplicationRunner{
    @GrpcClient("grpc-server")
    private TSDBServiceGrpc.TSDBServiceStub stub;

    public void run(ApplicationArguments args) throws Exception {
        BlobDLL.Builder blobDLL = BlobDLL.newBuilder();
        blobDLL.setDate("2023-08-06");
        blobDLL.setValue1(1.1d);
        blobDLL.setValue2(2.2d);
        BlobDLL dll = blobDLL.build();
        ArrayList<Any> data = Lists.newArrayList(Any.pack(dll), Any.pack(dll));
        StreamObserver<TSDBRequest> streamObserver = stub
                .withDeadlineAfter(10, TimeUnit.SECONDS)  // maybe fail with DEADLINE_EXCEEDED
                .read(new StreamObserver<TSDBResponse>() {
            @Override
            public void onNext(TSDBResponse tsdbResponse) {
                log.info("receive " + tsdbResponse);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                log.info("onCompleted ");

            }
        });


        for (int i = 0; i < 10; i++) {
            TSDBRequest.Builder builder = TSDBRequest.newBuilder();
            builder.setTsid(UUID.randomUUID().toString());
            builder.setAction("1");
            builder.setTstype(15);
            builder.setClz("aaa");

            builder.addAllData(data);
            TSDBRequest tsdbRequest = builder.build();
            streamObserver.onNext(tsdbRequest);
//            streamObserver.onCompleted();
            System.out.println("sent message #");
            Thread.sleep(1000);
        }
        streamObserver.onCompleted();
//        return "";
    }
}
