package com.company;
import java.util.Scanner;
public class Vedio_05{
    public static void main(String[] args)
    {
        System.out.println("taking usser input");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number first");
        int a=sc.nextInt();
        System.out.println("enter number second");
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println("the sum of these number:");
        System.out.println(sum);
        // next will print untill get space
        System.out.println("enter a string:");
        String str=sc.next();
        System.out.print("string is:");
        System.out.println(str);
        // nextLine will print untill all
        System.out.println("enter a string:");
        String str2=sc.nextLine();
        System.out.println("string is:"+str2);
        System.out.println(str2);
    }
}