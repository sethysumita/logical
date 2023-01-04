package com.centroxy;

public class Example {
    String name;
    int adharNo;
    double weight;
    long mobileNo;
    int streetNo;
    String jobName;

    Example(Object ...obj) {
        for(Object a:obj){
            System.out.println(a);
        }

    }


    public static void main(String args[]) {
        Example example = new Example("a", 3232, "ghj");
        System.out.println(example);

    }
}
