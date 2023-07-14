package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the day to know your routine");
	String x = sc.nextLine();
	switch (x){
        case "Monday":
            System.out.println("Physics Lab\nMaths\nBEE\nPhysics");
            break;
        case "Tuesday":
            System.out.println("AEC\nPhysics\nBEE");
            break;
        case "Wednesday":
            System.out.println("BEE Lab\nEVS\nMaths\nAEC");
            break;
        case "Thursday":
            System.out.println("Physics\nMaths\nAEC");
            break;
        case "Friday":
            System.out.println("Maths\nBEE\nPhysics");
            break;
        case "Saturday":
            System.out.println("CHUTTI");
            break;
        case "Sunday":
            System.out.println("Sunday hai yaar so jao aaram se");
            break;
        default:
            System.out.println("Acche se likho");
    }
}
}