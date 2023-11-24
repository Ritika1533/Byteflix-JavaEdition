package javacourse;

public class Lecture33 {
    static int add(int ...arr){
        //available ad int [] arr;
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(add());//0 
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6,1,1));
    }
}