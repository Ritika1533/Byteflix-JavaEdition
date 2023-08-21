//Java Program to Compute Quotient and Remainder
package com.company;

import java.util.Scanner;

public class Java05{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int quotient,reminder;
        System.out.println("enter the dividend");
        int dividend=sc.nextInt();
        System.out.println("enter the dividend");
        int divisor=sc.nextInt();
        reminder=dividend%divisor;
        quotient=dividend/divisor;
        System.out.println(" reminder is : "+ reminder);
        System.out.println(" quotient is : "+ quotient);
    }
}