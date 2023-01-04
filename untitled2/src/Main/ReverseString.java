package Main;

public class ReverseString {
    public static void main(String[] args) {
        /*String str = "pom";
        StringBuilder input = new StringBuilder();
        input.append(str);
        input.reverse();//String builder has method of reverse

        System.out.println(input);*/
        String str = "eat";
       char[] ch = str.toCharArray();
       for (int i = ch.length - 1; i >= 0; i--){
           System.out.print(ch[i]);
       }

    }
}
