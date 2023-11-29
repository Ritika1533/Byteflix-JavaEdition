package javacourse;
interface Bicycle{
    void applybreak(int decrement);
    void Speedup(int increment);
}
class AvonBicycle implements Bicycle{
    int speed=7;
    @Override
    public void applybreak(int decrement){
        speed=speed-decrement;
    }

    @Override
    public void Speedup(int increment) {
        speed += increment;
    }
}
public class Lecture54 {
    public static void main(String[] args){
        AvonBicycle ac=new AvonBicycle();
       // Bicycle bi=new Bicycle();
        //class not created of interface
    }
}
