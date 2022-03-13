package com.aditya;

public class nineteenth {
    public static void main(String[] args) {
        //logical operators
        {
            boolean isAdult = false;
            if (!isAdult)
                System.out.println("is adult");
            else
                System.out.println("not adult");
        }
        {
            int a = 19;
            int b = 18;
            if(a > 15 && b > 15)
                System.out.println("both are true");
        }
        {
            int a = 19;
            int b = 18;
            if(a < 50 || b < 10)
                System.out.println("atleast one of these is true");
        }
    }
}
