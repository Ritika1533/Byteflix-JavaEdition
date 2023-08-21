//Java Program to Add Two Integers
package com.company;

import java.util.Scanner;

public class Java02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("enter a number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of two number is:" + sum);
    }
}