//Java Program to Swap Two Numbers
package com.company;

import java.util.Scanner;

public class Java06{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("enter a number:");
        int b=sc.nextInt();
        System.out.println("number before swapping a="+a+" b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("number after  swapping a="+a+" b="+b);
    }
}