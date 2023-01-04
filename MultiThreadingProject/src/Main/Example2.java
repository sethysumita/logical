package Main;

public class Example2 {
    public static void main(String[] args) {
     Thread threads = new Thread(new RunnableProgram());
     threads.start();

    }
}