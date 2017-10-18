/* 
Implement an Odd/Even game
§ Roll a dice to get a number between 1-6
§ Ask users to guess Odd or Even
§ Track and announce result
You win/lose
You’ve played xx number of times
The system generate yy number of Odds and zz number of Even
Your winning percentage is nn %
§ Must use Array
Print out game history as user finishes playing
*/

import java.util.Scanner;


public class Hw_6{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		//declaration of variables 
		int dice;
		int guess;
		int plays = 0;
		int even1 = 0;
		int odd = 0;
		int win = 0;
		int guesses = 0;
		int winpercent = 0;
		boolean again = true;
		
		System.out.print ("Hello! \nHit any key to roll dice\nInput:");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		while (again) {
		dice = 1 + (int) (Math.random() * 6 ); //6 possibilities assigned to variable dice
		
		
		boolean even = true; //Stating what is even what is odd 
		if (dice == 2 || dice == 4 || dice == 6) {
			even = true; even1++;
		}
		else {
			even = false; odd++;
		}
		
		System.out.println("Guess if even or odd");
		System.out.print("Enter 1 for odd or 2 for even: "); plays++; guesses++;
		guess = input.nextInt();
		
		if (( guess < 1) || (guess > 2)) //In case user enters <1 or >2
			System.out.println("You did not enter 1 or 2");
		
		else {
			if (guess == 1 && even) 
				System.out.println("You lose");
		
			else if (guess == 2 && even) {
				System.out.println("You win"); win++; // adds on to number of wins 
			}
			else if (guess == 1 && !even) { 
				System.out.println("You win"); win++;
			}
			else if (guess == 2 && !even)
				System.out.println("You lose");
			}
		
		//Display results
		System.out.println("===============================");
		System.out.printf("You've played %d times %n", plays);
		System.out.printf("The system generated %d number of odds and %d number of even %n", odd, even1);
		winpercent = win / guesses * 100;
		System.out.printf("Your winning percentage is: %f percent %n", winpercent);
		
		String play;
		System.out.println("Would you like to play again?");
		System.out.print("Enter Y for yes or N for no ");
		play = input.next();
		
		//Prompt user to play again
		if (play.toUpperCase().equals("Y")) {
			again = true;
		}
			
		else {
			again = false;
			System.out.println("Thank you for playing");
			}
		}
		
	}
}

// Good job, Miguel...I need your full name
