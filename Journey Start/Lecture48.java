package javacourse;
class A{
    int a;
   public void method2(){
        System.out.println("i am method 2 of class A");
      
    }
    public void method3(){
        System.out.println("i am method 3 of class A");
    }

}
class B extends A{
    @Override
    public void method2(){
        System.out.println("i am method 2 of class B");
    }
    public void method4(){
        System.out.println("i am method 4 of class B");
    }
}
public class Lecture48 {
public static void main(String[] args){
    A a=new A();
    a.method2();
    B b=new B();
    b.method2();
//    I am method 2 of class A
//    I am method 2 of class B
}
}