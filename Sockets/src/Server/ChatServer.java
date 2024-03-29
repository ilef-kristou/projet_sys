package Server;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

import common.Message;

public class ChatServer {
    private static final List<ClientHandler> clients = new ArrayList<>();
    private static final List<Message> messageHistory = new ArrayList<>();
    private static final List<Message> pendingMessages = new ArrayList<>();

    public static void main(String[] args) {
        final int PORT = 12345;

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started on port " + PORT);

            // Attente de la connexion des clients
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket);

                // Créer un nouveau thread pour gérer le client
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                clientHandler.start();

                // Envoyer les messages en attente au nouveau client
                for (Message message : pendingMessages) {
                    clientHandler.sendMessage(message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void broadcast(Message message) {
        messageHistory.add(message); // Ajouter le message à l'historique

        for (ClientHandler client : clients) {
            if (!client.sendMessage(message)) {
                // Si l'envoi du message échoue pour un client, le retirer de la liste
                clients.remove(client);
            }
        }
    }

    public static void addPendingMessage(Message message) {
        pendingMessages.add(message);
    }
}