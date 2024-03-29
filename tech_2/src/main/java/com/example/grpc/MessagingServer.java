package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class MessagingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new MessagingServiceImpl())
                .build();

        server.start();
        System.out.println("Server started, listening on " + server.getPort());
        server.awaitTermination();
    }

    static class MessagingServiceImpl extends MessagingServiceGrpc.MessagingServiceImplBase {
        @Override
        public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
            String message = request.getMessage();
            System.out.println("Received message: " + message);

            MessageResponse response = MessageResponse.newBuilder()
                    .setResponse("Message received: " + message)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}