package com.centroxy;

import java.util.Stack;
//
public class StackProgram {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("cat");
        animals.push("dog");
        animals.push("fish");
        animals.push("monkey");


         System.out.println(animals.peek());
         animals.pop();
         System.out.println(animals);

    }


}
