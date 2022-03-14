package com.JAVA_OOPS;
//Polymorphism
class Child{
    String name;
    int age;

    //method overloading

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class third {
    public static void main(String[] args){
        Child s1 = new Child();
        s1.name = "Aditya";
        s1.age = 22;

        s1.printInfo(s1.name, s1.age);
    }
}
