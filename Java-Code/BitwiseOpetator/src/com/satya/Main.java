package com.satya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x & y;
        int b = x | y;
        System.out.println("First Number AND Second Number = " + a);
        System.out.println("First Number OR Second Number = " + b);
        System.out.println("Enter a Number for Shifting :");
        int z = sc.nextInt();
        System.out.println("Enter Number of times you want to Shift :");
        int w = sc.nextInt();
        int c = z >> w;
        int d = z << w;
        System.out.println(z + " Right Shifted " + w +" times = " + c);
        System.out.println(z + " Left Shifted " + w +" times = " + d);
    }
}
