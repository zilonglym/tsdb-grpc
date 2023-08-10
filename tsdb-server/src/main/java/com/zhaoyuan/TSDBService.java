package com.zhaoyuan;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zhaoyuan.proto.auto.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j
public class TSDBService extends TSDBServiceGrpc.TSDBServiceImplBase{
    @Override
    public StreamObserver<TSDBRequest> write(StreamObserver<TSDBResponse> responseObserver) {
        return new StreamObserver<TSDBRequest>() {
            @Override
            public void onNext(TSDBRequest tsdbRequest) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }


    /**
     * 流式读取TSDB数据接口
     * @param responseObserver
     * @return
     */
    @Override
    public StreamObserver<TSDBRequest> read(StreamObserver<TSDBResponse> responseObserver) {
        return new StreamObserver<TSDBRequest>() {
            @Override
            public void onNext(TSDBRequest tsdbRequest) {
                log.info("TSDB Read " + tsdbRequest);
                if (tsdbRequest.getData(0).is(BlobDLL.class)) {
                    try {
                        BlobDLL blobDLL = tsdbRequest.getData(0).unpack(BlobDLL.class);
                        double value1 = blobDLL.getValue1();
                        log.info("blob.get(0).value1 is " + value1);
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                log.info("TSDB Server Read Completed");
            }
        };
    }
}
