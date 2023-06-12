package com.example.grpcserverdemo.server;

import com.example.grpcserverdemo.serviceImpl.YourServiceImplementation;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(2020)
                .addService(new YourServiceImplementation())
                .build();

        server.start();
        System.out.println("gRPC server started on port 2020");

        server.awaitTermination();
    }
}
