package javacourse;
class Base1{
    int X;
    Base1(){
        System.out.println("i am a constructor of base class");
    }
    Base1(int X){
        this.X=X;
        System.out.println("i am a constructor of base class with the value of a :"+ this.X);
    }
}
class Derieved1 extends Base1{
    int Y;

    Derieved1(){
        //super(5);
        System.out.println("i am a constructor of derieved class");
    }
    Derieved1(int X,int Y){
        super(9);
        System.out.println("i am a constructor of derieved class with value of y :"+ Y);
    }
}
class ChildOfDerieved1 extends Derieved1 {
    ChildOfDerieved1(int X, int Y, int Z) {
        super(X, Y);
        System.out.println("i am a constructor of childofderieved class with value of z " + Z);
    }

    ChildOfDerieved1() {
        System.out.println("i am a constructor of childofderieved class");
    }
}

    public class Lecture46 {
        public static void main(String[] args) {
            // Base1 b=new Base1();
            // Derieved1 d=new Derieved1(67,9);
            //derieved class constructor first called base class costructor
            ChildOfDerieved1 cd = new ChildOfDerieved1(7,5,4);
        }
    }