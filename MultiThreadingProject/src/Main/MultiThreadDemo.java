package Main;

public class MultiThreadDemo extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=8;i++){
            System.out.println("thread:"+i);
        }


    }
}
