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
	 
	 switch(level) {
	 case 1:
		 max = 50;
		 break;
		 
	 case 2:
		 max = 100;
		 break;
		 
	 case 3:
		 max = 500;
		 break;
	 default
	 :
		 System.out.println("Invalid choice , using Medium.");
		 max = 100;
		 
	 }
		 int secret = ran.nextInt(max)+1;
		 int guess =0;
		 int attempts =0; 
	
	  System.out.println("I have picked a number between 1 -"+ max +".");
	  
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
