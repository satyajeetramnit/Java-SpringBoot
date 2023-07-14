package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        int[] marks = new int[5];

//        int[] marks;
//        marks = new int[5];

//        int marks[] = new int[5];
//        System.out.println(marks[3]);

//        int marks[] = {1,2,3,4,5};
//        marks[2] = 6;
//        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students in class :");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i=0; i<n ;i++){
            System.out.println("Enter the marks scored by Student no. " + (i+1));
            marks[i] = sc.nextInt();
        }
        double averageMarks = 0;
        for (int i=0; i<n ;i++){
            averageMarks = averageMarks + marks[i];
        }
        averageMarks = averageMarks / n;

        System.out.println("The average marks is " + averageMarks);

    }
}
