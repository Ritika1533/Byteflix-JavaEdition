package javaCourse;
interface SampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends SampleInterface{
    //void meth1();
    //void meth2();
    //are inherited
    void meth3();
    void meth4();
}
class C implements SampleInterface,childSampleInterface{
//cant possible to implement multiple abstract class
     @Override
    public void meth1() {
         System.out.println("meth1 class c");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 class c");
    }

    @Override
    public void meth3() {
        System.out.println("meth3 class c");
    }

    @Override
    public void meth4() {
        System.out.println("meth4 class c");
    }
}
class D implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("meth1 class D");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 class D");
    }

    @Override
    public void meth3() {
        System.out.println("meth3 class D");
    }

    @Override
    public void meth4() {
        System.out.println("meth4 class D");
    }
}
public class Lecture57 {
public static void main(String[] args){
    C cc=new C();
    D dd=new D();
    cc.meth1();
    cc.meth2();
    cc.meth3();
    cc.meth4();
    dd.meth1();
    dd.meth2();
    dd.meth3();
    dd.meth4();
}
}
