package javaCourse;
class Circle{
      int radius;
      public Circle(){
          System.out.println("i am circle class constructor");
      }
      public Circle(int radius) {
          System.out.println("i am circle class constructor");
        this.radius = radius;
      }

      double area(){
        return (Math.PI*this.radius*this.radius);
      }
}
    class Cylinder1 extends Circle{
     int height;
    public Cylinder1(int radius, int height) {
        super(radius);
        System.out.println("i am cylinder class constructor");
        this.height = height;
    }
    double Volume(){
    return (Math.PI*this.radius*this.radius*this.height);
 }
    double area(){
        return ((2*Math.PI*this.radius*this.height)+(Math.PI*this.radius*this.radius));
    }
}
class Rectangle1{
    int length;
    int breadth;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle1() {

    }

    public Rectangle1(int breadth, int length) {
        this.breadth = breadth;
        this.length=length;
    }

}
class Cuboid extends Rectangle1{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cuboid() {
        super();

    }

    public Cuboid(int breadth, int length, int height) {
           super(breadth, length);
          this.height = height;
       }
    public double VolumeCuboid(){
            return (length*breadth*height);
       }
}
  class lecture52 {
    public static  void main(String[] args){
   // Cylinder1 cc=new Cylinder1(3,7);
   // System.out.println("volume of cylinder:"+cc.Volume());
  //  System.out.println("area of cylinder:"+cc.area());
   // Cuboid cd=new Cuboid(1,2,3);
   // System.out.println("volume of cubiod:"+cd.VolumeCuboid() );
        Rectangle1 rr=new Rectangle1();
        Cuboid cd=new Cuboid();
        cd.setLength(1);
        cd.setBreadth(2);
        cd.setHeight(3);
        System.out.println("volume of cuboid: " + cd.VolumeCuboid());
    }
}