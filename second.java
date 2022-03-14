package com.JAVA_OOPS;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class second {
    public static void main(String[] args){
       Student s1 = new Student();
       s1.name = "Aditya";
       s1.age = 22;

       s1.printInfo();
    }
}
