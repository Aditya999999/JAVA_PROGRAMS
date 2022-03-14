package com.JAVA_OOPS;
//static keyword
class Student1{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newschool";
    }
}
public class seven {
    public static void main(String[] args){
        Student1.school = "JMV";
        Student1 student_A = new Student1();
        student_A.name = "Aditya";
        System.out.println(student_A.school);
        System.out.println(student_A.name);
    }
}
