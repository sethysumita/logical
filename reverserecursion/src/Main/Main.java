package Main;

public class Main {
 static int ans =0;

static int reverse (int var){
    if (var == 0){
      return  ans;
    }
    if(var > 0){
        int temp = var%10;
        ans = ans*10 +temp;
        reverse(var/10);
    }
    return ans;
}


    public static void main(String[] args) {
//       int time = 20;
//    String result = (time<18) ? "Good Day" : "Good Evnening";
//        System.out.println(result);
     int var = 98765;
     int rev;
     rev = reverse(var);
        System.out.println(rev);

    }
}
