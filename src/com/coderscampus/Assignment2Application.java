package com.coderscampus; 

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		Scanner scanner = new Scanner(System.in); 
		boolean guessRight = false; 
		int guessLimit = 0;
		
		while (guessLimit < 5) { 
				System.out.println("Pick a number between 1 and 100");
			    int playerGuess = scanner.nextInt(); 
			
		    if (playerGuess < 1 || playerGuess > 100) {
		    	System.out.println("Your guess is not between 1 and 100, please try again");
        	
		    } else if (randomNumber > playerGuess ) {
				System.out.println("Please pick a higher number"); 
			guessLimit++;
		
			} else if (randomNumber < playerGuess) {
				System.out.println("Please pick a lower number"); 
			guessLimit++;
			}else {
				guessRight = true; 
				break;
		}
		
		}if(guessRight) {
		    	System.out.println("You win!");
			} else {
				System.out.println("You lose");
				System.out.println("The number to guess was:" + randomNumber);
		}
		scanner.close();
}
}
