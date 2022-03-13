package com.aditya;

public class twenty_one {
    public static void main(String[] args){
        //conditional statements - SWITCH
        int day = 4; //1- monday; 2- tuesday
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed - Sun");
        }

    }
}
