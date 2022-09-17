package com.javait.day4;

import java.util.Scanner;

public class NaturalNumbersReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number value : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
