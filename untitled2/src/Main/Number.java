package Main;

public class Number {

    public static void all(int num){
        if(num>0)
        {
            all(num-1);

            System.out.println(num+"");

      }

    }
    public static void main(String[] args) {
        all(10);

    }
}
