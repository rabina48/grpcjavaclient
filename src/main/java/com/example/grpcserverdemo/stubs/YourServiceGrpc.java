package com.example.grpcserverdemo.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: server.proto")
public final class YourServiceGrpc {

  private YourServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.server.YourService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpcserverdemo.stubs.YourRequest,
      com.example.grpcserverdemo.stubs.YourResponse> getYourMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "YourMethod",
      requestType = com.example.grpcserverdemo.stubs.YourRequest.class,
      responseType = com.example.grpcserverdemo.stubs.YourResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpcserverdemo.stubs.YourRequest,
      com.example.grpcserverdemo.stubs.YourResponse> getYourMethodMethod() {
    io.grpc.MethodDescriptor<com.example.grpcserverdemo.stubs.YourRequest, com.example.grpcserverdemo.stubs.YourResponse> getYourMethodMethod;
    if ((getYourMethodMethod = YourServiceGrpc.getYourMethodMethod) == null) {
      synchronized (YourServiceGrpc.class) {
        if ((getYourMethodMethod = YourServiceGrpc.getYourMethodMethod) == null) {
          YourServiceGrpc.getYourMethodMethod = getYourMethodMethod = 
              io.grpc.MethodDescriptor.<com.example.grpcserverdemo.stubs.YourRequest, com.example.grpcserverdemo.stubs.YourResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.server.YourService", "YourMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcserverdemo.stubs.YourRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcserverdemo.stubs.YourResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new YourServiceMethodDescriptorSupplier("YourMethod"))
                  .build();
          }
        }
     }
     return getYourMethodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YourServiceStub newStub(io.grpc.Channel channel) {
    return new YourServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YourServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new YourServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YourServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new YourServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class YourServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void yourMethod(com.example.grpcserverdemo.stubs.YourRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcserverdemo.stubs.YourResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getYourMethodMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getYourMethodMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpcserverdemo.stubs.YourRequest,
                com.example.grpcserverdemo.stubs.YourResponse>(
                  this, METHODID_YOUR_METHOD)))
          .build();
    }
  }

  /**
   */
  public static final class YourServiceStub extends io.grpc.stub.AbstractStub<YourServiceStub> {
    private YourServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YourServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YourServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YourServiceStub(channel, callOptions);
    }

    /**
     */
    public void yourMethod(com.example.grpcserverdemo.stubs.YourRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcserverdemo.stubs.YourResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getYourMethodMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class YourServiceBlockingStub extends io.grpc.stub.AbstractStub<YourServiceBlockingStub> {
    private YourServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YourServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YourServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YourServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpcserverdemo.stubs.YourResponse yourMethod(com.example.grpcserverdemo.stubs.YourRequest request) {
      return blockingUnaryCall(
          getChannel(), getYourMethodMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class YourServiceFutureStub extends io.grpc.stub.AbstractStub<YourServiceFutureStub> {
    private YourServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YourServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YourServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YourServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpcserverdemo.stubs.YourResponse> yourMethod(
        com.example.grpcserverdemo.stubs.YourRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getYourMethodMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_YOUR_METHOD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final YourServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(YourServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_YOUR_METHOD:
          serviceImpl.yourMethod((com.example.grpcserverdemo.stubs.YourRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpcserverdemo.stubs.YourResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class YourServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YourServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpcserverdemo.stubs.Server.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("YourService");
    }
  }

  private static final class YourServiceFileDescriptorSupplier
      extends YourServiceBaseDescriptorSupplier {
    YourServiceFileDescriptorSupplier() {}
  }

  private static final class YourServiceMethodDescriptorSupplier
      extends YourServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    YourServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (YourServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YourServiceFileDescriptorSupplier())
              .addMethod(getYourMethodMethod())
              .build();
        }
      }
    }
    return result;
  }
}
