package Main;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("pink");
        colors.add("black");
        colors.add("yellow");
        System.out.println(colors);
        for (String addColors : colors){
            System.out.println(addColors);
        }
    }
}
