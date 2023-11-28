package javacourse;
 abstract class Parent{
    public Parent(){
        System.out.println("i am parent class constructor");
    }
   abstract public  void greet();
     abstract public  void greet2();
}

class Child1 extends Parent{
     @Override
     public void greet(){
         System.out.println("hello everyone");
    }
    @Override
    public void greet2(){
        System.out.println("hello sir");
    }
}

abstract class Child2 extends Parent{
     public void welcome(){
         System.out.println("welcome packet");
     }
}
public class Lecture53 {
      public static void main(String[] args){
       //  Parent p=new Parent();
          //cant make object of abstract class
         Child1 c=new Child1();
       //  Child2 c2=new Child2();
}
}