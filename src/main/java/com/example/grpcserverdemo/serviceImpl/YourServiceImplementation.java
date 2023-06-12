package com.example.grpcserverdemo.serviceImpl;

import com.example.grpcserverdemo.stubs.YourRequest;
import com.example.grpcserverdemo.stubs.YourResponse;
import com.example.grpcserverdemo.stubs.YourServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class YourServiceImplementation extends YourServiceGrpc.YourServiceImplBase {
    @Override
    public void yourMethod(YourRequest request, StreamObserver<YourResponse> responseObserver) {
        // Server logic to process the request and generate a response
        String responseMessage = "Response from 2020 gRPC2 server: " +  request.getMessage()+ ""+request.getName();
        if(request.getMessage().equals("true")){
            responseMessage="Essay topics in English can" +
                    " be difficult to come up with. " +
                    "While writing essays, many college " +
                    "and high school students face writer’s " +
                    "block and have a hard time to think about topics and ideas for an essay. In this article, we will list out many good essay topics from different categories like argumentative essays, essays on technology, environment essays for students from 5th, 6th, 7th, 8th grades. Following list of essay topics are for all – from kids to college students. We have the largest collection of essays. An essay is nothing but a piece of content which is written from the perception of writer or author. Essays are similar to a story, pamphlet, thesis, etc. The best thing about Essay is you can use any type of language – formal or informal. It can biography, the autobiography of anyone. Following is a great list of 100 essay topics." +
                    " We will be adding To calculate the response time in your scenario where gRPC calls are made between multiple projects (project1, project2, project3), you can measure the time taken at various points in your code. Here's an approach you can follow:\n" +
                    "\n" +
                    "Start a timer: Before making the gRPC call from project1 to project2, start a timer to measure the overall response time. You can use the System.nanoTime() method to get a high-resolution timestamp in nanoseconds.\n" +
                    "\n" +
                    "Make the gRPC call from project1 to project2.\n" +
                    "\n" +
                    "Record the time taken: After receiving the response from project2, stop the timer and calculate the elapsed time. Subtract the start time from the current time using System.nanoTime() and convert the difference to the desired unit (e.g., milliseconds or seconds).\n" +
                    "\n" +
                    "Repeat steps 1-3 for the gRPC call from project1 to project3.\n" +
                    "\n" +
                    "Add up the response times: Sum up the individual response times from project2 and project3 to get the overall response time for project1.400 more soon!";
        }

       YourResponse yourResponse= callAnotherGrpc(responseMessage, responseObserver);
        YourResponse response = YourResponse.newBuilder()
                .setResponseMessage(yourResponse.getResponseMessage())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }


    public YourResponse callAnotherGrpc(String message,  StreamObserver<YourResponse> responseObserver){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2021)
                .usePlaintext()
                .build();

        // Generate the client stub
        YourServiceGrpc.YourServiceBlockingStub client = YourServiceGrpc.newBlockingStub(channel);

//         Invoke the gRPC API
        YourRequest request = YourRequest.newBuilder()
                .setMessage(message)
                .build();
        YourResponse response = client.yourMethod(request);
//        YourResponse response = YourResponse.newBuilder()
//                .setResponseMessage(message)
//                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();


//        YourResponse response = client.yourMethod(request);

        // Handle the response
//        System.out.println("Response from 2021 gRPC server: " + response.getResponseMessage());
        return response;
    }
}
