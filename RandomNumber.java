import java.util.*;
import java.io.*;
public class RandomNumber
{
    public static void main(String[] args)
    { 
      Scanner in=new Scanner(System.in);
      int RandomNumber=1+(int)(100*Math.random());
      int noOfTrials=5;
      System.out.println("Choose any number between 1 to 100");
      System.out.println("Note:YOU NEED TO GUESS NUMBER WITHIN 5 TRAILS.");
      System.out.println("----------GAME STARTS NOW----------");
      int i=0;
      for(i=0;i<5;i++){
          System.out.println("Guess the number:");
          int guess=in.nextInt();
          if(guess<0 || guess>100){
              System.out.println("INVALID NUMBER! GAME OVER...");
              break;
          }
          if(guess==RandomNumber){
           System.out.println("Congrats! you won the game");
            break;
          }
          else if(guess>RandomNumber&&(i!=noOfTrials-1)){
              System.out.println("Your number is Bigger! Try again...");
          } 
          else if(guess<RandomNumber && (i!=noOfTrials-1)){
              System.out.println("Your Number is Smaller! Try again...");
          }
      }
      if(i==noOfTrials){
          System.out.println("Sorry! your trials are completed ");
          System.out.println("The computer Number was: "+RandomNumber);
      }
    }
}
		