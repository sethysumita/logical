public class Example1
{
 public static  String concatString(){
     String  st ="java";
     for (int i=0;i<10000;i++){
         st = st +"tpoint";
         System.out.println();
     }
     return st;

 }
 public static String concatStringBuffer(){
     StringBuffer sb = new StringBuffer("java");
     for (int i =0; i<10000; i++){
         sb.append("tpoint");
     }
     return sb.toString();
 }

    public static void main(String[] args) {
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
    }
}
