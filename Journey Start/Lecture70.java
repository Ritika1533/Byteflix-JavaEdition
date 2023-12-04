package javacourse;
import java.util.*;
class MyThread1 extends Thread{
@Override
public void run(){
    int i=0;
   while (i<500){
       System.out.println("cooking thread1 ");
       i++;
          }
     }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<500){
            System.out.println("CHAT thread2 ");
            i++;
        }
    }
}
public class Lecture70 {
    public static void main(String[] args){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
       t1.start();
        t2.start();
    }
}
