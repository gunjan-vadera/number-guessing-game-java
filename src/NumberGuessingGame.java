import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
	
	static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    
  public static void main(String args[]) {
	System.out.println("Welcome to the Number Guessing Game!!");
	
	String again; // it stores the players's answer..
	
	do {
	  playGame();
	  
	  System.out.println("Play Again1!? (Yes/No):");
	  
	  again = sc.next();
	  
	} while(again.equalsIgnoreCase("Yes"));
	
	System.out.println("Thanks for Playing!!");
	
	sc.close();
	  
  }
  static int chooseDifficulty() {
	  System.out.println("Choose Difficulty");
	  System.out.println("1. Easy (1-50)");
	  System.out.println("2. Medium (1-100)");
	  System.out.println("3. Hard (1-500)");
	  System.out.println("ENTER YOUR CHOICE");
	  return sc.nextInt();
	  
  }
  static void playGame() {
	 int level = chooseDifficulty();
	 int max;
	 int maxAttempts; // stores how many guesses are allowed
	 
	 
	 switch(level) {
	 case 1:
		 max = 50;
		 maxAttempts = Integer.MAX_VALUE; //is the largest possible int (about 2 billion). We use it to mean “unlimited”, because nobody will make that many guesses.
		 break;
		 
	 case 2:
		 max = 100;
		 maxAttempts = 10;
		 break;
		 
	 case 3:
		 max = 500;
		 maxAttempts = 8;
		 break;
		 
	 default
	 :
		 System.out.println("Invalid choice , using Medium.");
		 max = 100;
		 maxAttempts = 10;
		 
	 }
		 int secret = ran.nextInt(max)+1;
		 int guess =0;
		 int attempts =0; 
		 boolean won = false;
	
	  System.out.println("I have picked a number between 1 -"+ max +".");
	  
	  while(attempts < maxAttempts && !won) {
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
					  won = true;
				  System.out.println("You Guessed It.."+ attempts + "Attempts");
				  }	  
			if(!won && maxAttempts != Integer.MAX_VALUE) {
				System.out.println("Attempts Left : "+(maxAttempts-attempts));
			}
			
		  }
	  if(!won) {
			System.out.println("You lost!! The number was "+ secret + ".");
		}
  }
}
