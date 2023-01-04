public class Task {

    Task(String name, int age, String address, int streetNo, double height, double weight);

    public static void main(String args[]) {
        Task task = new Task();
        System.out.println(task.name);
    }
}
