package javacourse;
class OurEmp{
    public int  id;
    private  String name;
    //default constructor
    public OurEmp(){
        id=65;
        name="avc";
    }
    //paramatrised constructor
    public OurEmp(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){this.name=n;}
    public int getId(){return id;}
    public void setId(int i){this.id=i;}
}
public class Lecture42 {
public static void main(String[] args){
    OurEmp ram=new OurEmp(33,"sharma");
   // ram.setId(76);
   // ram.setName("ram");
    System.out.println(ram.getId());
    System.out.println(ram.getName());

}
}
