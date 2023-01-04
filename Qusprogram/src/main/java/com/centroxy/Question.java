package com.centroxy;

 class Question {
     public String athleteName;
     public double athleteSpeed;
     public int athleteAge;
   /* //instance variables
    int age;
    String name;
    public  static void main(String args[]){
        //local variable*/

    public Question(String name,double speed, int age){
        this.athleteName=name;
        this.athleteAge=age;
        this.athleteSpeed=speed;

    }
  public static  void  main(String args []){
        int speed =100;
      System.out.println("athleteRunsAt"+speed+"km/hr");
  }
 }