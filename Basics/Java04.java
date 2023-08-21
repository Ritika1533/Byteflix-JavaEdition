//Java Program to Find ASCII Value of a character
package com.company;

import java.util.Scanner;

public class Java04{
 public static void main(String[] args){

     Scanner sc= new Scanner(System.in);
     System.out.println("enter a character:");
     char ch=sc.next().charAt(0);
     int i=ch;
     System.out.println("ascii value of character is :"+i);

 }
}