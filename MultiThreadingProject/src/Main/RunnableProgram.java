package Main;

import javax.lang.model.util.ElementKindVisitor6;

public class RunnableProgram implements Runnable{
    @Override
    public void run() {
        int i =1;
        while(i<8){
            System.out.println("threds :"+i);
            i++;
            try {
                Thread.sleep(1500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    }

