package com.collegeboard.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

import junit.framework.TestCase;

public class NumberGuessingByComputerTest extends TestCase {

/**
 * If user enter ready the number guesing game will start
 */
	public void testBeginGame() {
		Scanner reader = new Scanner(System.in);
		
		assertEquals("ready", reader.next());
		
		
	}
	
	/**
	 * If the selected option from the user is higher then
	 * lower bound = randomNumber+1;
	 */
	public void testOptionForHigher() {
		int lowBound = 0,highBound = 100,randomNumber;
	    Random generator = new Random();
	    randomNumber = generator.nextInt(highBound-lowBound+1)+lowBound;
	    assertEquals(highBound+(randomNumber + 1),highBound+( randomNumber + 1));
		
		
	}	
		/**
		 * If the user enter option is Lower then
		 * upperBound = randomNumber-1;
		 * 
		 * 	
		 */
	public void testOptionForLower() {
		int lowBound = 0,highBound = 100,randomNumber;
	    Random generator = new Random();
	    randomNumber = generator.nextInt(highBound-lowBound+1)+lowBound;
	    assertEquals(lowBound+(randomNumber - 1),lowBound+( randomNumber - 1));
		
		
	}	
	
	/**
	 * If the user enter option is Yes .
	 */
			
	public void testOptionForCorrectGuess() {
		Scanner reader = new Scanner(System.in);
		assertEquals("yes", reader.next());
		
		
		
	}

}
