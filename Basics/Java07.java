//Java Program to Check Whether a Number is Even or Odd
package com.company;
import java.util.Scanner;
public class Java07{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println(" number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}