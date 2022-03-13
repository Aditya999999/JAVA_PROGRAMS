package com.aditya;
import java.util.Arrays;
public class ninth {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 87;
        marks[3] = 56;
        marks[4] = 86;
        //index
        System.out.println(marks[4]);
        //lenght
        System.out.println(marks.length);
        //sort
        Arrays.sort(marks);
        System.out.println(marks[4]);
    }

}
