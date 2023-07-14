package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        int sum = 0;
//        int temp = n;
//        while (temp>0){
//            int lastDigit = temp%10;
//            sum += lastDigit;
//            temp /=10;
//            System.out.println(lastDigit+"  " +sum+"  "+temp);
//        }
//        System.out.println("The sum of the digits of given number = " + sum);
//        //To find no of digits
//        int numberOfDigits = (int)Math.log10(n) + 1;
//        System.out.println("numberOfDigits = " + numberOfDigits);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        int reversedNumber = 0,temp = n;
//        while (temp > 0){
//            int lastDigit = temp%10;
//            reversedNumber = reversedNumber * 10 +lastDigit;
//            temp/=10;
//        }
//        if (reversedNumber == n){
//            System.out.println(n + " is palindrome");
//        }
//        else{
//            System.out.println(n + " is not palindrome");
//        }
        int n;
        do{
            n = sc.nextInt();
            System.out.println("Number is " + n);
        }while(n!=0);
    }
}
