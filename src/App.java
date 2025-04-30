import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        TaskManager todo = new TaskManager();

        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("ENTER ANY OPTIONS");
            System.out.println("1. List tasks");
            System.out.println("2. Add tasks");
            System.out.println("3. Remove tasks");
            System.out.println("4. Mark as complete tasks");
            System.out.println("5. Exit TO DO");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    todo.listTask();

                    break;
                case 2:
                    System.out.println("How many tasks do you want to add");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Enter a new Task");
                        sc.nextLine();
                        String str = sc.nextLine();
                        todo.addTask(str);
                    }
                    break;
                case 3:
                    System.out.println(todo.getTasks());
                    System.out.println("Enter which task you want to delete");
                    int index = sc.nextInt();
                    todo.deletetask(index);
                    break;
                case 4:
                    System.out.println(todo.getTasks());
                    System.out.println("Enter which task you want to mark as completed");
                    int ind = sc.nextInt();
                    todo.markComplete(ind);
                    break;
                case 5:
                    running = false;
                    break;
            }
        }

        sc.close();

    }
}
