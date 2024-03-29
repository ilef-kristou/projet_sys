import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            TaskManager taskManager = (TaskManager) registry.lookup("TaskManager");

            // Ajouter une tâche
            taskManager.addTask("Faire les courses");

            // Récupérer la liste des tâches
            List<String> tasks = taskManager.getAllTasks();
            System.out.println("Liste des tâches :");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task " + i + ": " + tasks.get(i));
            }

            // Supprimer une tâche (par exemple la première tâche de la liste)
            if (!tasks.isEmpty()) {
                taskManager.removeTask(0);
                System.out.println("Tâche supprimée avec succès.");
            } else {
                System.out.println("Aucune tâche à supprimer.");
            }

            // Afficher à nouveau la liste des tâches après suppression
            tasks = taskManager.getAllTasks();
            System.out.println("Liste des tâches après suppression :");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task " + i + ": " + tasks.get(i));
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}