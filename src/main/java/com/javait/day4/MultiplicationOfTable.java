package com.javait.day4;

import java.util.Scanner;

public class MultiplicationOfTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number value : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        System.out.println("Above Table Number is :" + num);

    }
}
