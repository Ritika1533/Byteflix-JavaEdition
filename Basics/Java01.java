//  Java Program to Print an Integer (Entered by the User)
package com.company;

import java.util.Scanner;

public class Java01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        System.out.println("the num is:"+ num);
    }
}