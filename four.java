package com.JAVA_OOPS;

//Inheritance
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
//single level inheritance
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((int)(0.5*l*h));
    }
}
//multi-level inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println((int)(0.5*l*h));
    }
}
//hierarchical inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class four {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        t1.area(6,6);
        c1.area(6);
    }
}
