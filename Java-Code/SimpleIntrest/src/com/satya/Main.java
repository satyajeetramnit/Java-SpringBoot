package com.satya;
import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        int p = sc.nextInt();
        System.out.println("Enter the Rate of intrest :");
        int r = sc.nextInt();
        System.out.println("Enter the Time in which the Interest is to be calculated");
        int t = sc.nextInt();
        double i= (p*r*t)/100;
        System.out.println("The Interest is Equal to " + i);
     }
}