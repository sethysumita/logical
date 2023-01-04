package Main;

public class Swap {

    public static void main(String[] args) {
        int a=10 , b = 5;
        /*int t;//third variable
        t =a;//here i store vlue in t
        a=b;// b value stored in a
        b=t;*/
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a"+a);
        System.out.println("b"+b);


    }
}
