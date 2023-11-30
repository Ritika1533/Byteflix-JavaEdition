package javacourse;
abstract class Pen{
    abstract  void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void changeNib(){
        System.out.println("changing nib");
    }
    @Override
    void write() {
        System.out.println("writting");
    }

    @Override
    void refill() {
        System.out.println("filling");
    }
}
interface baseAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump() {
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}
class Human extends Monkey implements baseAnimal{

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

}
abstract class TelePhone{
    abstract void rig();
    abstract void lift();
    abstract void disconnect();
}
class PhoneSmart extends TelePhone{

    @Override
    void rig() {
     System.out.println("ringing");
    }

    @Override
    void lift() {
        System.out.println("lifting");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting");
    }
}
interface tvRemote{
    void Changechannel();
    void incSound();
}
interface SmartTvRemote extends tvRemote{
    void speakchngchannel();
}
class tv implements tvRemote{

    @Override
    public void Changechannel() {
        System.out.println("changed");
    }

    @Override
    public void incSound() {
        System.out.println("increased");
    }
}
public class Lecture60 {
    public static void main(String[] args){
       // Human hh=new Human();
       // hh.jump();
       // hh.sleep();
       // Monkey mm=new Human();
      //  mm.jump();
      //  mm.sleep(); not allowed
      // TelePhone t=new PhoneSmart() ;
     //  t.disconnect();
     //  tv tt=new tv();
      
        }
    }