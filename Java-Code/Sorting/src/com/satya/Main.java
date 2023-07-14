package com.satya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bubble sort
//        System.out.println("Enter number of Elements :");
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        System.out.println("Enter values :");
//        for(int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for(int i = 0; i < (n-1); i++){
//            boolean sorted = true;
//            for(int j = 0;j < (n-1-i);j++){
//                if(a[j+1] < a[j]){
//                    int temp = a[j+1];
//                    a[j+1] = a[j];
//                    a[j] = temp;
//                    sorted = false;
//                }
//            }
//            if(sorted) break;
//        }
//        for(int item : a){
//            System.out.print(item + " ");
//        }

        //Selection Sorting

        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values :");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < (n-1); i++){
            int minInd = i;
            for(int j = i;j < (n);j++){
                if(a[j] < a[minInd]){
                    minInd = j;
                }
            }
            int temp = a[i];
            a[i] = a[minInd];
            a[minInd] = temp;
            sorted = false;
        }
        for(int e : a){
            System.out.print(e + " ");
        }
    }
}
