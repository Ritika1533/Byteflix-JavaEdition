package javacourse;
class MyEmp{
    private int  id;
    private  String name;
    public String getName(){
    return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }

}
public class Lecture40 {
public static void main(String[] args){
    MyEmp ee=new MyEmp();
    //ee.id=76;
    //ee.name="rohit";
    ee.setId(67);
    ee.setName("abcd");
    System.out.println(ee.getId());
    System.out.println(ee.getName());
}
}