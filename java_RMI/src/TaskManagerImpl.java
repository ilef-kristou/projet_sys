import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class TaskManagerImpl extends UnicastRemoteObject implements TaskManager {
    private List<String> tasks;

    protected TaskManagerImpl() throws RemoteException {
        super();
        tasks = new ArrayList<>();
    }

    public void addTask(String task) throws RemoteException {
        tasks.add(task);
        System.out.println("Tâche ajoutée : " + task);
    }

    public void removeTask(int taskId) throws RemoteException {
        if (taskId >= 0 && taskId < tasks.size()) {
            String removedTask = tasks.remove(taskId);
            System.out.println("Tâche supprimée : " + removedTask);
        } else {
            System.out.println("Impossible de supprimer la tâche : ID invalide.");
        }
    }

    public List<String> getAllTasks() throws RemoteException {
        System.out.println("Récupération de la liste des tâches.");
        return tasks;
    }
}
