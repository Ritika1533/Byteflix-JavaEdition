package javacourse;
class Phone{
    public void ShowTime(){
        System.out.println("time i 6 am");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class SmartPhone extends Phone{
    public void playMusic(){
        System.out.println("playing music");
    }
    @Override
    public void on(){
        System.out.println("turning on Smartphone");
    }
}
public class Lecture49 {
    public static void main(String[] args){
    Phone obj=new SmartPhone();
         //parent=child allowed
        //  SmartPhone obj2=new Phone();
        // child=parent
        obj.on();
        obj.ShowTime();
       // obj.playMusic(); not will run the child class method
    }
}
