package com.nest.example.service;

import com.example.server.GreetingServiceGrpc;
import com.example.server.HelloRequest;
import com.example.server.HelloResponse;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
  @Override
  public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
    String name = request.getName();
    HelloResponse response = HelloResponse.newBuilder().setGreeting("Hello" + name).build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
