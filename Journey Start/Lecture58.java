package javacourse;
//57 and 58 exchanged in name
import java.util.Arrays;

interface Camera{
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
interface wifi{
     String[] getNetwork();
     void connectToNetwork(String network);
}
class MyCellPhone{
     int number;
     void callNumber(int number){
     System.out.println("calling"+ this.number);
}
     void pickCall(){
          System.out.println("connecting"+ number);
     }
}

class MySmartPhone extends MyCellPhone implements Camera,wifi{

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

  //   @Override
     //     public void record4kvedio() {
     //          System.out.println("recoding vedio in high quality");
     //     }
}

public class Lecture58 {
public static void main(String[] args){
     MySmartPhone ms=new MySmartPhone();
     String[] str=ms.getNetwork();
     for(String item:str) System.out.println(item);
     ms.record4kvedio();
     //if override is there then it will implement not in the interface one if override is not there then interface will play
     //we can,t access private method of interface in out class dircetly but we can call that in inside another method
}
}
