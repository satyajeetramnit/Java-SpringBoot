package com.satya;

public class Main {

    public static void main(String[] args) {
        int Result = 0+1;
        System.out.println("0 + 1 = "+Result);
        int PreviousResult = Result;
        Result += 1;
        System.out.println(PreviousResult + " + 1 = " + Result);
        PreviousResult = Result;
        Result *= 10;
        System.out.println(PreviousResult + " * 10 = " + Result);
        PreviousResult = Result;
        Result -= 2;
        System.out.println(PreviousResult + " - 2 = " + Result);
        PreviousResult = Result;
        Result /= 2;
        System.out.println(PreviousResult + " / 2 = " + Result);
        PreviousResult = Result;
        Result %= 2;
        System.out.println(PreviousResult + " % 2 = " + Result);
        Result ++;
        System.out.println("Now the result is " + Result);
        Result --;
        System.out.println("Now the result is " + Result);
        boolean isAlien = false;
        boolean isProtecterate = true;
        if (isAlien == false)
            System.out.println("It is not an alien");
        int a = 5,b =8;
        if (a < b)
             System.out.println(a + " is less than " + b);
        if (a > b)
            System.out.println(a + " is not less than " + b);
        if ((a <= 5) && (b >= 5))
            System.out.println("The value of a is less than or equal to 5 also the value od b is greater than or equal to 5");
        if ((a <= 6) || (b >= 10))
            System.out.println("Either the value of a is less than or equal to 5 or the value od b is greater than equal to 10");
        int c = 1;
        boolean d = c == 1 ? true : false ;
        if (c == 1) {
            System.out.println("The value was 1");
        } else {
            System.out.println("The value was not 1");
        }


    }
}
