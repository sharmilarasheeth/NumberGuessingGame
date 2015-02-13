package com.collegeboard.numberguessinggame;

import java.util.Random;
import java.util.Scanner;
/**
 * This class implements logic for playing the number guessing game. The user starts the game by typing 
 * READY or ready. Then the computer finds the number guessed by the user.
 * It assumes that the user is guessing a number between 0 and 100.
 * @author Sharmila
 *
 */
public class NumberGuessingByComputer {
	/**
	 * This method is used to start the game 
	 *  if user enter ready ,the game will start
	 * @param reader
	 */
	
	public static void  beginGame(Scanner reader){
		
		

		    if(reader.next().equalsIgnoreCase("ready")){
		    	
		    	computerGuess(reader);
		    	
		    }
		    	
		    	
	}

	private static void computerGuess(Scanner reader) {
		int lowBound = 0,highBound = 100,randomNumber;
	    String option;
	    Random generator = new Random();
	    
	    while (true){
			//random number will be generated based on the range 
		    randomNumber = generator.nextInt(highBound-lowBound+1)+lowBound;
		    System.out.println("Is the number "+randomNumber+"?");
			
			 
			System.out.println("Please enter the option <LOWER or HIGHER or YES>");
			option = reader.next();
			
			if("YES".equalsIgnoreCase(option)||"END".equalsIgnoreCase(option))
			{
					System.out.println("Your guess is "+randomNumber);
					System.out.println("You have successfully completed the Game!!");
					break;
				
				
			}
			else if("HIGHER".equalsIgnoreCase(option))
			{
				lowBound = randomNumber + 1;
				
			}
			else if("LOWER".equalsIgnoreCase(option))
			{	
				highBound = randomNumber - 1;

			}

		}
		// TODO Auto-generated method stub
		
	}    
				
		public static void main(String[] args){
			Scanner reader = new Scanner(System.in);
			System.out.println("Please type <READY or ready> to start the game...");
			  //  If the user enter ready the guessing came will start
			
			beginGame(reader);
		}
	

}
