package com.example.grpcserverdemo.client;

import com.example.grpcserverdemo.stubs.YourRequest;
import com.example.grpcserverdemo.stubs.YourResponse;
import com.example.grpcserverdemo.stubs.YourServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Grpc2020Client {
    public static void main(String[] args) {
        // Create a gRPC channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2021)
                .usePlaintext()
                .build();

        // Generate the client stub
        YourServiceGrpc.YourServiceBlockingStub client = YourServiceGrpc.newBlockingStub(channel);

        // Invoke the gRPC API
        YourRequest request = YourRequest.newBuilder()
                .setMessage("20211111111")
                .build();
        YourResponse response = client.yourMethod(request);

        // Handle the response
        System.out.println("Response from 2021111 gRPC server: " + response.getResponseMessage());

        // Shut down the channel
//        channel.shutdown();
    }
}
