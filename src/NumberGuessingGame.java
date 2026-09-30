import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int SecretNo = ran.nextInt(100) + 1; // ran.nextInt(100) will givw a number from 0 to 99,so we add 1 to get it from 1 to 99
		
		int guesses = 0;
		int NoOfAttempts = 0;
		
		System.out.println("Welcome To The Number Guessing Game!");
		System.out.println("I hhave picked a nnumber between 1-100. Can you it!?");
		
		while(guesses!=SecretNo) {
			System.out.println("Enter your guess :");
			guesses = sc.nextInt();
			NoOfAttempts++;
		
		if(guesses>SecretNo) {
			System.out.println("Too high ! try smaller number..");
		}
			else if(guesses<SecretNo) {
				System.out.println("Too Low ! try higher number..");
			}
			else {
				System.out.println("Correct! You Guessed it Right" +NoOfAttempts+ "Attempts");
			}
		
		}
		sc.close();
	}

}
