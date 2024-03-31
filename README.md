# Objectif du projet

Ce projet vise à développer des serveurs et des clients en utilisant trois technologies de communication distribuée en Java : Java RMI, gRPC et les sockets.
## Java RMI

### Spécification :

Le module Java RMI gère une liste de tâches, permettant d'ajouter, de supprimer et de récupérer des tâches.

### Déploiement :
### Prérequis :
-Java Development Kit (JDK) installé sur votre système.
### Etapes de déploiement :

1. Cloner le dépôt GitHub :
   ```bash
   git clone https://github.com/ilef-kristou/projet_sys
2. Naviguer vers le module Java RMI :
   ```bash
   cd C:\Users\ilefk\projetjava\projet_sys\java_RMI
3. Compiler les fichiers sources pour produire les fichiers '.class' correspondants
   ```bash
   javac TaskManager.java
   javac TaskManagerImpl.java
4. Excécuter le serveur
   ```bash
   java src\RMIServer.java
6. Exécuter le client
   ```bash
   java src\RMIClient.java
### Test:
Après le deploiement, vous pouvez tester le fonctionnement en ajoutant, supprimant des taches dans la liste des taches et recupérant la liste compléte des taches.
1. Lancer le serveur et les clients en suivant les instructions de deploiement ci-dessus.

2. Utiliser les fonctionnalités du client pour ajouter ou supprimer des taches de la liste

3. Les clients enverront les requetes au serveur qui traite les demandes et mettre à jour la liste de taches.
   
4. Vous pouvez tester différents scénarios.
## gRPC :
### Spécification :
Le service de messagerie gRPC permet d'envoyer des messages texte à un destinataire spécifié et de récupérer les messages reçus pour un utilisateur donné.
### Deploiement :
### Prérequis :
-Java Development Kit (JDK) installé sur votre système.

-Maven (pour la gestion des dépendances et la compilation des sources).

-Protocole Buffer (protobuf) installé sur votre système.
### Etapes de déploiement :
1. Cloner le dépôt GitHub :
   ```bash
   git clone https://github.com/ilef-kristou/projet_sys
2. Naviguer vers le module GRPC :
   ```bash
   cd C:\Users\ilefk\projetjava\projet_sys\GRPC
3. Assurez-vous d'avoir les dépendances requises et les outils installés sur votre système. Veuillez vous référer au fichier pom.xml pour les dépendances Maven.
4. Générez les classes Java à partir du fichier proto en exécutant la commande suivante :
   ```bash
   mvn clean package
5. Démarrez le serveur en exécutant la classe MessagingServer.java.
6. Lancez l'application client en exécutant la classe MessagingClient.java.
### Test :
1. Une fois le serveur démarré et le client lancé, vous pouvez tester les fonctionnalités du service de messagerie.

2. Utilisez les fonctionnalités du client pour envoyer des messages à des destinataires spécifiés et récupérer les messages reçus pour un utilisateur donné.

3. Vérifiez les réponses du serveur pour vous assurer que les opérations se déroulent comme prévu.
## Les sockets
### Spécification :
Le service de chat basé sur les sockets permet l'envoi de messages texte à un salon de discussion commun et la récupération des messages envoyés par d'autres utilisateurs.
### Déploiement :
### Prérequis :
-Java Development Kit (JDK) installé sur votre système.
### Etapes de déploiement :

1. Cloner le dépôt GitHub :
   ```bash
   git clone https://github.com/ilef-kristou/projet_sys
2. Naviguer vers le module Sockets :
   ```bash
   cd C:\Users\ilefk\projetjava\projet_sys\Sockets
3. Compiler les fichiers du serveur pour produire les fichiers '.class' correspondantes
   ```bash
   javac src\server\ChatServer.java
   javac src\server\ClientHandler.java
4. Compiler les fichiers du client pour produire le fichiers '.class' correspondant
   ```bash 
   javac src\server\ChatClient.java
5. Compiler le fichier Message.java:
   ```bash
   javac src\common\Message.java
6. Exécuter le serveur :
   ```bash
   java src\Server\ChatServer.java
7. Excécuter le client :
   ```bash
   java src\Client\ChatClient.java
### Test :
#### Test de connexion :
1. Après le déploiement du serveur et du client, vérifiez que le serveur a démarré correctement et écoute sur le port spécifié.

2. Lancez le client et vérifiez qu'il se connecte avec succès au serveur.
#### Test d'envoi et de réception de messages :
1. À partir du client, envoyez un message au serveur.

2. Vérifiez que le serveur reçoit le message et le transmet correctement à tous les clients connectés.

3. Vérifiez que le client ou les clients concernés reçoivent le message avec succès.


## Auteur : 
### Réalisé par Kristou Ilef
