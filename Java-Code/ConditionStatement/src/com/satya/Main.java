package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Suppose you have a rose in your hand and you are thinking of that special someone wondering if he loves you or not, now according to typical bollywood concept you can get a answer.");
	System.out.println("Enter the no. of rose petals");
	int x = sc.nextInt();
	if( x % 2 == 0)
    {
        System.out.println("He loves me!");
    }
	else if( x % 2 == 1)
    {
        System.out.println("He loves me not");
    }
	else
	    {
        System.out.println("You will always be single");
        }
    }
}
