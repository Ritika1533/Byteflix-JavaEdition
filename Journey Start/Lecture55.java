package javacourse;
//can't use multiple abstract class to extends class but 
//can use mutliple interface(more than one class) to implements a class 
interface Bycycle{
    int a=19;
    //can also set property but cant modify it because all property in interface is  final
    void applybreak(int decrement);
    void Speedup(int increment);

    void blowHorn();

    void  blowNoHorn();
}
interface HornBycicle{
    void blowHorn();
    void  blowNoHorn();
}
class AvonBycycle implements Bycycle,HornBycicle {

    int speed=7;
    void horn(){
        System.out.println("pee pee poo poo");
    }
    @Override
    public void applybreak(int decrement){
        speed=speed-decrement;
        System.out.println("decremented");
    }

    @Override
    public void Speedup(int increment) {
        speed += increment;
        System.out.println("incremented");
    }
    @Override
    public void blowHorn(){
        System.out.println("BLOW BLOW");
    }
    @Override
   public void  blowNoHorn(){
        System.out.println(" NO BLOW NO BLOW");
    }
}

public class Lecture55 {
    public static void main(String[] args){
        AvonBycycle ay=new AvonBycycle();
       // ay.applybreak(1);
      //  System.out.println(ay.a);
        //decremented
        //19
       // ay.a=87; throw error cant do this
        ay.blowHorn();
        ay.blowNoHorn();

    }
}