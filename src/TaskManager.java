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

        /*
         * System.out.println("How many tasks do you want to add");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * System.out.println("Enter a task");
         */
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
