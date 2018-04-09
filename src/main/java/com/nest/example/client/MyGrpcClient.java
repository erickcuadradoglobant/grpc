package com.nest.example.client;

import com.example.server.GreetingServiceGrpc;
import com.example.server.HelloRequest;
import com.example.server.HelloResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
//import io.restassured.response.Response;

public class MyGrpcClient {
  public static void main(String[] args) throws InterruptedException {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9081)
        .usePlaintext(true)
        .build();

    GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
    HelloResponse response = stub.greeting(HelloRequest.newBuilder()
        .setName("World")
        .putBagOfTricks("Trick", "magic!")
        .addHobbies("soccer")
        .build());
   
    
    
    
    System.out.print(response);
    //System.out.print(response2);
  }
  public HelloResponse saludo(String name) {
	  ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9081)
		        .usePlaintext(true)
		        .build();

		    GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
		    HelloResponse response = stub.greeting(HelloRequest.newBuilder()
		        .setName(name)
		        //.setHobbies(2, "soccer")
		        .putBagOfTricks("Trick", "magic!")
		        .addHobbies("soccer")
		        .build());
		    HelloResponse response2 = stub.greeting(HelloRequest.newBuilder()
			        .setName(name)
			        //.setHobbies(2, "soccer")
			        .putBagOfTricks("Trick", "magic!")
			        .addHobbies("soccer")
			        .build());
		   

		    System.out.print(response);
		    System.out.print(response2);
		    return response;
	  
  }
}
