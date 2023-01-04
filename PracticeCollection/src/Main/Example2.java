package Main;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"pink");//adding  element in first position(0)
        list.add(1,"red");//adding element in second position (1)

        System.out.println(list);

        System.out.println(list.get(0));//retrieve of specified index element
        //update at specified index
        System.out.println(list.set(0,"purple"));
    }

    }

