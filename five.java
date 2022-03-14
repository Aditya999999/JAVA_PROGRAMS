package com.JAVA_OOPS;

//Abstraction

abstract class Animal{
    abstract public void walk();
    //creating constructor named as Animal()
    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    //creating a constructor named as Horse()
    Horse(){
        System.out.println("Created a Horse");
    }
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    @Override
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class five {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
