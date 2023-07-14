package com.satya;
import javax.swing.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows :");
        int m = sc.nextInt();
        System.out.println("Enter Rows :");
        int n = sc.nextInt();
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        for(int i =0;i<m;i++){
//            for(int j = 0; j < n ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        for(int i =0;i<m;i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        * * * * * *
//          * * * * *
//            * * * *
//              * * *
//                * *
//                  *
//        for(int i =0;i<m;i++) {
//            for(int j =0 ; j < i ;j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        for(int i =0;i<m;i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
//        for(int i =0;i<m;i++) {
//            for(int j =0 ; j < m-i ;j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//              *
//            *   *
//          *   *   *
//        *   *   *   *
//        for(int i =0;i<m;i++) {
//            for(int j =0 ; j < m-i ;j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*   ");
//            }
//            System.out.println();
//        }
//              1
//            2   3
//          4   5   6
//        7   8   9   10
//        int x = 1;
//        for(int i =0;i<m;i++) {
//            for(int j =0 ; j < m-i ;j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(x++ + "   ");
//            }
//            System.out.println();
//        }
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        for(int i = 0;i < m;i++){
//            if (i<=(m)/2){
//                for(int j=0;j<= i;j++)
//                    System.out.print("* ");
//            }
//            else{
//                for(int j=0;j<n-i;j++)
//                    System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        *
//        *   *
//        *      *
//        *         *
//        *  *  *  *  *
        for (int i = 0 ; i < m ; i++ ){
            for(int j = 0 ; j <= i ; j++ ){
                if(i == 0 || i == m-1 || j == 0 || j == i){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
