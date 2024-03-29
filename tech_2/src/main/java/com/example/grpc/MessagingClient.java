package com.example.grpc;

import static com.example.grpc.MessagingServiceGrpc.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MessagingClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        MessagingServiceBlockingStub stub = newBlockingStub(channel);

        MessageResponse response = stub.sendMessage(MessageRequest.newBuilder()
                .setMessage("Hello, gRPC!")
                .build());

        System.out.println("Response from server: " + response.getResponse());

        channel.shutdown();
    }
}