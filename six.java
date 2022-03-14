package com.JAVA_OOPS;
//Pure Abstraction using interface
interface Animal1{
    public void walk();
}
interface Herbivore{

}
//We created two interfaces to demonstrate multiple-inheritance
//which is possible through interfaces in JAVA
class Horse1 implements Animal1, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class six {
    public static void main(String[] args){
        Horse1 horse = new Horse1();
        horse.walk();
    }
}
