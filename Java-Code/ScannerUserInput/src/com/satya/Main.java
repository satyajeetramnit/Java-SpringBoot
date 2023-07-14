package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer :");
	int a = sc.nextInt();
	int b;
	System.out.println("Enter a double value :");
	double c = sc.nextDouble();
	double d;
	b = (a*10) + 5;
	d = c/10;
	System.out.println("The resultant integer value is "+ b);
	System.out.println("The Resultant Double value is " + d);

    }
}
