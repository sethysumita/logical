package Main;

public class Main {
    //fibonacci
    /*public  static int fibonacci(int n){
        if(n==0){
            return 0;

        }
        if(n==1|| n==2){

            return 1;

        }
        return fibonacci(n-2) + fibonacci(n-1);*/
    //}


    public static void main(String[] args) {
   /*     int maxNubmer =10;
        System.out.println("fibonacci num" + maxNubmer+"numbers");
        for(int i = 0; i < maxNubmer; i++){
            System.out.print(fibonacci(i) +" ");*/
        //}
        int num = 1245, rem ,rev =0;
        while(num!=0){
            rem = num%10;
            rev = rev*10+ rem;
            num= num/10;
        }
        System.out.print(rev);
    }
}
