package com.example.grpc.client;

import com.example.grpc.messaging.Message;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import com.example.grpc.messaging.*;

public class MessagingClient {
    private final ManagedChannel channel;
    private final MessagingGrpc.MessagingBlockingStub blockingStub;

    public MessagingClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = MessagingGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void sendMessage(String senderId, String receiverId, String message) {
        MessageRequest request = MessageRequest.newBuilder()
                .setSenderId(senderId)
                .setReceiverId(receiverId)
                .setMessage(message)
                .build();
        try {
            MessageResponse response = blockingStub.sendMessage(request);
            System.out.println("Response: " + response.getStatus());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public void getMessages(String userId) {
        UserRequest request = UserRequest.newBuilder().setUserId(userId).build();
        try {
            MessageList messageList = blockingStub.getMessages(request);
            for (Message message : messageList.getMessagesList()) {
                System.out.println("Message: " + message.getContent());
            }
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MessagingClient client = new MessagingClient("localhost", 50051);
        try {
            client.sendMessage("senderId", "receiverId", "Hello");
            client.getMessages("userId");
        }