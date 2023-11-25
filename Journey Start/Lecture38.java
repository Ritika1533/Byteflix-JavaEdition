package javacourse;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Lecture38 {
    public static void main(String[] args){
        Employee rr=new Employee();
        Employee nn=new Employee();
        rr.id=8795;
        rr.name="ritika";
        rr.salary=12;
        nn.id=7653;
        nn.name="nikki";
        nn.salary=15;
       int salary=rr.getSalary();
       System.out.println(salary);
        rr.printDetails();
        nn.printDetails();
        // System.out.println(rr.id);
        // System.out.println(rr.name);
    }
}