package javacourse;
class Cylinder{
    int radius;
    int height;


    public Cylinder(int radius,int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double calculateSurfaceArea(){
        //2πrh+2πr2
        double area=((2*Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.radius));
        return area;
    }
}
class MyRectangle{
    int length;
    int breadth;
    public MyRectangle(){
       length=4;
       breadth=5;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public MyRectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length=length;
    }
}
public class Lecture44 {
    public static void main(String[] args){
        //QUESTION1
        //             Cylinder cc=new Cylinder();
        //             cc.setRadius(12);
        //             System.out.print("the radius of Cylinder is : "+ cc.getRadius());
        //             System.out.println("");
        //             cc.setHeight(15);
        //             System.out.println("the height of Cylinder is : " + cc.getHeight());

        //QUESTION2
        //             System.out.println("Surfac area:"+cc.calculateSurfaceArea());


        // QUESTION3
        //             Cylinder cc=new Cylinder(12,15);
        //             System.out.println("Surfac area:"+cc.calculateSurfaceArea());

        //QUESTION4
        MyRectangle rr=new MyRectangle(5,8);
       System.out.println(rr.getBreadth());
       System.out.println((rr.getLength()));
    }
}