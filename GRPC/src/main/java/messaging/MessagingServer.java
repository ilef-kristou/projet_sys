package messaging;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class MessagingServer {
    private Server server;

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new MessagingImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("* shutting down gRPC server since JVM is shutting down");
            MessagingServer.this.stop();
            System.err.println("* server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final MessagingServer server = new MessagingServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class MessagingImpl extends MessagingGrpc.MessagingImplBase {
        @Override
        public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
            // Implémentation de la logique d'envoi de message
        }

        @Override
        public void getMessages(UserRequest request, StreamObserver<MessageList> responseObserver) {
            // Implémentation de la logique de récupération de messages
        }
    }
}
