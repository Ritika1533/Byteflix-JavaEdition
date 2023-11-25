package javacourse;
class emp{
    int salary;
    String name;
   public int getSalary(){
        return salary;
    }
    public String getName(){
       return name;
    }
    public String setName(String newname){
       name=newname;
       return name;
    }

}
class CellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class Lecture39 {

    public static void main(String[] args){
   //QUESTION1
        /*

             emp ee=new emp();
             ee.salary=20;
             ee.name="ritika";
             System.out.println( ee.getName());
             System.out.println( ee.getSalary());
            System.out.println(ee.setName("ritika keshri"));

         */


        //QUESTION2
        /*
        CellPhone oppo=new CellPhone();
        oppo.vibrate();
        oppo.ring();
        */


        //QUESTION3
        /*
        Square squ=new Square();
        squ.side=50;
       System.out.println("perimeter:"+  squ.perimeter());
       System.out.println("area:"+ squ.area());
      */

        //QUESTION4
        Rectangle rect=new Rectangle();
        rect.length=20;
        rect.breadth=10;
       System.out.println("area : "+  rect.area() );
       System.out.println("perimeter "+ rect.perimeter());

    }
}
