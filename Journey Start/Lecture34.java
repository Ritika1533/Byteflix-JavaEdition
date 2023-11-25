package javacourse;

public class Lecture34 {
    static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        else
        return n*factorial(n-1);
        //     5*factorial(4)
        //      4*factorial(3)
        //       3*factorial(2)
        //        2*factorial(1)
        //         1*factorial(0)
    }
 
    public static void main(String[] args){
        int n=5;
        System.out.println("factorial 5!:" + factorial(n));
       
    }
}