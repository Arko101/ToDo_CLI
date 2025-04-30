import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> task = new ArrayList<String>();

    public void listTask() {
        boolean result = task.isEmpty();
        if (result == true) {
            System.out.println("No task has been added");
        } else
            System.out.println(task);

    }

    public void addTask(String a) {

        task.add(a);

    }

    public void deletetask(int i) {
        task.remove(i);
    }

    public void markComplete(int i) {
        task.set(i, task.get(i) + " is done");
    }

    public ArrayList<String> getTasks() { // List<String> getTask() -> this is supposed to work better, find out.
        return task;
    }

}
