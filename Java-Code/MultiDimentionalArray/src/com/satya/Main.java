package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        6
//        System.out.println("Enter Number of Rows :");
//        int rows = sc.nextInt();
//        System.out.println("Enter Number of columns :");
//        int columns = sc.nextInt();
//
//        int a[][] = new int[rows][columns];
//        int b[][] = new int[rows][columns];
//        System.out.println("For Matrix A");
//        for(int i = 0; i < rows; i++){
//            for (int j = 0; j < columns ;j++){
//                System.out.println("Enter the value of matrix A at " + (i+1) +" * " + (j+1));
//                a[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        System.out.println("For Matrix B");
//        for(int i = 0; i < rows; i++){
//            for (int j = 0; j < columns ;j++){
//                System.out.println("Enter the value of matrix B at " + (i+1) +" * " + (j+1));
//                b[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        int c[][] = new int[rows][columns];
//        for(int i = 0; i < rows; i++){
//            for (int j = 0; j < columns ;j++){
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        System.out.print ln("The Resultant Matrix after Addition");
//        for(int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println("For Matrix A");
        System.out.println("Enter Number of Rows :");
        int rows1 = sc.nextInt();
        System.out.println("Enter Number of columns :");
        int columns1 = sc.nextInt();
        System.out.println("Enter Values :");
        int a[][] = new int[rows1][columns1];
        for(int i = 0; i < rows1; i++){
            for (int j = 0; j < columns1 ;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("For Matrix B");
        System.out.println("Enter Number of Rows :");
        int rows2 = sc.nextInt();
        System.out.println("Enter Number of columns :");
        int columns2 = sc.nextInt();
        System.out.println("Enter Values :");
        int b[][] = new int[rows2][columns2];
        for(int i = 0; i < rows2; i++){
            for (int j = 0; j < columns2 ;j++){
                b[i][j] = sc.nextInt();
            }
        }
        if(columns1 == rows2) {
            int c[][] = new int[rows1][columns2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for(int k = 0; k < rows1; k++ ){
                        c[i][j] = a[i][k] + b[k][j];
                    }
                }
            }
            System.out.println("The Resultant Matrix after Addition");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The given matrices can't be multiplied");
        }
    }
}
