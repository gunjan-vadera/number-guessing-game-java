import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
	
	static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    
  public static void main(String args[]) {
	System.out.println("Welcome to the Number Guessing Game!!");
	playGame();
	sc.close();
	  
  }
  
  static void playGame() {
	  int secret = ran.nextInt(100)+1;
	  int guess = 0;
	  int attempts = 0;
	  
	  System.out.println("I have picked a number between 1-100..");
	  
	  while(guess!=secret) {
		  System.out.println("Enter your Guess..");
		  guess = sc.nextInt();
		  attempts++;
		  
		  if(guess>secret){
			  System.out.println("Number too high! Try smaller Number..");
		  }
			  else if(guess<secret) {
				  System.out.println("Number too low! Try higher Number..");
			  }
				  else {
				  System.out.println("You Guessed It.."+ attempts + "Attempts");
			  }
		  }
	  }
}
