import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        TaskManager todo = new TaskManager();

        System.out.println("ENTER ANY OPTIONS");
        System.out.println("1. List tasks");
        System.out.println("2. Add tasks");
        System.out.println("3. Remove tasks");
        System.out.println("4. Mark as complete tasks");
        System.out.println("5. Exit TO DO");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1:
                todo.listTask();

                break;
            case 2:
                System.out.println("Enter a new Task");
                Scanner s = new Scanner(System.in);
                String str = s.nextLine();
                todo.addTask(str);
                break;
            case 3:
                System.out.println(todo.getTasks());
                System.out.println("Enter which task you want to delete");
                Scanner st = new Scanner(System.in);
                int index = st.nextInt();
                todo.deletetask(index);
                break;
            case 4:
                System.out.println(todo.getTasks());
                System.out.println("Enter which task you want to mark as completed");
                Scanner stg = new Scanner(System.in);
                int ind = stg.nextInt();
                todo.markComplete(ind);
                break;
            default:
                break;
        }

        sc.close();

    }
}
