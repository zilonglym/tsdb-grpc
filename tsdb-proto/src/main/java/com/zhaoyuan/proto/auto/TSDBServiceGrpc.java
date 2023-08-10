package com.zhaoyuan.proto.auto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: TSDB.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TSDBServiceGrpc {

  private TSDBServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.zhaoyuan.proto.auto.TSDBService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zhaoyuan.proto.auto.TSDBRequest,
      com.zhaoyuan.proto.auto.TSDBResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "write",
      requestType = com.zhaoyuan.proto.auto.TSDBRequest.class,
      responseType = com.zhaoyuan.proto.auto.TSDBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zhaoyuan.proto.auto.TSDBRequest,
      com.zhaoyuan.proto.auto.TSDBResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<com.zhaoyuan.proto.auto.TSDBRequest, com.zhaoyuan.proto.auto.TSDBResponse> getWriteMethod;
    if ((getWriteMethod = TSDBServiceGrpc.getWriteMethod) == null) {
      synchronized (TSDBServiceGrpc.class) {
        if ((getWriteMethod = TSDBServiceGrpc.getWriteMethod) == null) {
          TSDBServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<com.zhaoyuan.proto.auto.TSDBRequest, com.zhaoyuan.proto.auto.TSDBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhaoyuan.proto.auto.TSDBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhaoyuan.proto.auto.TSDBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TSDBServiceMethodDescriptorSupplier("write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhaoyuan.proto.auto.TSDBRequest,
      com.zhaoyuan.proto.auto.TSDBResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = com.zhaoyuan.proto.auto.TSDBRequest.class,
      responseType = com.zhaoyuan.proto.auto.TSDBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zhaoyuan.proto.auto.TSDBRequest,
      com.zhaoyuan.proto.auto.TSDBResponse> getReadMethod() {
    io.grpc.MethodDescriptor<com.zhaoyuan.proto.auto.TSDBRequest, com.zhaoyuan.proto.auto.TSDBResponse> getReadMethod;
    if ((getReadMethod = TSDBServiceGrpc.getReadMethod) == null) {
      synchronized (TSDBServiceGrpc.class) {
        if ((getReadMethod = TSDBServiceGrpc.getReadMethod) == null) {
          TSDBServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<com.zhaoyuan.proto.auto.TSDBRequest, com.zhaoyuan.proto.auto.TSDBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhaoyuan.proto.auto.TSDBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhaoyuan.proto.auto.TSDBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TSDBServiceMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TSDBServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TSDBServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TSDBServiceStub>() {
        @java.lang.Override
        public TSDBServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TSDBServiceStub(channel, callOptions);
        }
      };
    return TSDBServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TSDBServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TSDBServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TSDBServiceBlockingStub>() {
        @java.lang.Override
        public TSDBServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TSDBServiceBlockingStub(channel, callOptions);
        }
      };
    return TSDBServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TSDBServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TSDBServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TSDBServiceFutureStub>() {
        @java.lang.Override
        public TSDBServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TSDBServiceFutureStub(channel, callOptions);
        }
      };
    return TSDBServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBRequest> write(
        io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     *可以定义多个服务类，一个雷利可以有多个方法
     * gRPC有4种流式
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBRequest> read(
        io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getReadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TSDBService.
   */
  public static abstract class TSDBServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TSDBServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TSDBService.
   */
  public static final class TSDBServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TSDBServiceStub> {
    private TSDBServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TSDBServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TSDBServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBRequest> write(
        io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *可以定义多个服务类，一个雷利可以有多个方法
     * gRPC有4种流式
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBRequest> read(
        io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TSDBService.
   */
  public static final class TSDBServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TSDBServiceBlockingStub> {
    private TSDBServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TSDBServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TSDBServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TSDBService.
   */
  public static final class TSDBServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TSDBServiceFutureStub> {
    private TSDBServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TSDBServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TSDBServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WRITE = 0;
  private static final int METHODID_READ = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBResponse>) responseObserver);
        case METHODID_READ:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.read(
              (io.grpc.stub.StreamObserver<com.zhaoyuan.proto.auto.TSDBResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getWriteMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.zhaoyuan.proto.auto.TSDBRequest,
              com.zhaoyuan.proto.auto.TSDBResponse>(
                service, METHODID_WRITE)))
        .addMethod(
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.zhaoyuan.proto.auto.TSDBRequest,
              com.zhaoyuan.proto.auto.TSDBResponse>(
                service, METHODID_READ)))
        .build();
  }

  private static abstract class TSDBServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TSDBServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zhaoyuan.proto.auto.TSDBProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TSDBService");
    }
  }

  private static final class TSDBServiceFileDescriptorSupplier
      extends TSDBServiceBaseDescriptorSupplier {
    TSDBServiceFileDescriptorSupplier() {}
  }

  private static final class TSDBServiceMethodDescriptorSupplier
      extends TSDBServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TSDBServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TSDBServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TSDBServiceFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .addMethod(getReadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
