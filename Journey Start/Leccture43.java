package javacourse;
import java.util.Scanner;
import java.util.Random;
 class Game{
     int number;
     int noOfGusses;
     int usserInput;
     int noOfGuess;
      Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
     }
     public void takeUserInput(){
         System.out.println("enter the number:");
         Scanner sc=new Scanner(System.in);
         usserInput=sc.nextInt();
     }
     public boolean isNumberCorrect(){
          noOfGuess++;
         if (usserInput==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuess);
             return true;
         }
         else if(usserInput<number){
             System.out.println("Too low...");
         }
         else if(usserInput>number){
             System.out.println("Too high...");
         }
         return false;
     }

     public int getNoOfGusses() {
         return noOfGusses;
     }

     public void setNoOfGusses(int noOfGusses) {
         this.noOfGusses = noOfGusses;
     }

}
public class Lecture43{

     public static void main(String[] args){
     boolean correct=false;
     int count=0;
     Game g=new Game();
     while(!correct)
     {
         g.takeUserInput();
         correct=g.isNumberCorrect();

     }

     }
}