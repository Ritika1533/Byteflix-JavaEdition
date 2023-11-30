package javaCourse;
import java.util.Arrays;

interface Camera2{
    void takeSnap();
    void takevedio();

    private void greet() {
        System.out.println("goodmorning");
    }

    default void record4kvedio() {
        greet();
        System.out.println("recoding vedio in 4k");
    }
}
interface wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    int number;
    void callNumber(int number){
        System.out.println("calling"+ this.number);
    }
    void pickCall(){
        System.out.println("connecting"+ number);
    }
}

class MySmartPhone2 extends MyCellPhone2 implements Camera2,wifi2{

    @Override
    public void takeSnap() {
        System.out.println("taking snap");
    }

    @Override
    public void takevedio() {
        System.out.println("taking vedio");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("getting list of network");
        String[] network={"jio","airtel","vodafone"};
        return network;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting to "+ network);
    }

       @Override
         public void record4kvedio() {
              System.out.println("recoding vedio in high quality");
        }
}
public class Lecture59{
    public static void main(String[] args){
        Camera2 cam=new MySmartPhone2();
       // cam.getNetwork(); not allowed means want camera then use smartphone as camera only
        cam.record4kvedio();
        MySmartPhone2 s=new MySmartPhone2();
        s.connectToNetwork("bv");
        s.takeSnap();
        s.record4kvedio();
    }
}
