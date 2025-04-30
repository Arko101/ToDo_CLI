import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    ArrayList<String> task = new ArrayList<String>();

    public void listTask() {
        for (int i = 0; i < task.size(); i++) {
            System.out.println(task.get(i));
        }
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
