//Java Program to Multiply two Floating Point Numbers
package com.company;

import java.util.Scanner;

public class Java03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a floating number:");
        float num1=sc.nextFloat();
        System.out.println("enter a floating number:");
        float num2=sc.nextFloat();
        float mul=num1*num2;
        System.out.println("multiplication of two number is:"+ mul);
    }
}