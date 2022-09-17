package com.javait.day4;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower number value : ");
        int lv = sc.nextInt();
        System.out.println("Enter the higher number value : ");
        int hv = sc.nextInt();
        int count = 0;

        for (int i = lv; i <= hv; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.print(i + " ");
            }
                   }
        System.out.println("\nOdd number between " + lv + " and " + hv + " is :" + count);
    }
}