package sk.balaz.guess.number;

import java.util.Random;

public class TextGuessNumber {

	/** Default minimal number for guessing */ 
	private static final int MIN_NUMBER_DEFAULT = 10;

	/** Default maximal number for guessing */
	private static final int MAX_NUMBER_DEFAULT = 1;

	/** Minimal number for guessing */
	private int minNumber = MIN_NUMBER_DEFAULT;

	/** Maximal number for guessing */
	private int maxNumber = MAX_NUMBER_DEFAULT;

	/** Random number generated for guessing */
	private int randomNumber;
	
	/** User entered number for guessing */
	private int guessNumber;

	/**
	 * Default constructor which generates number for guessing
	 * from interval : <1,10>
	 * 
	 */
	public TextGuessNumber() {
		randomNumber = getRandomNumber();
	}

	public GuessStatus guess(int guessNumber) {
		if (guessNumber < randomNumber) {
			return GuessStatus.LESS;
		} else if (guessNumber > randomNumber) {
			return GuessStatus.GREATER;
		} else {
			return GuessStatus.EQUAL;
		}
	}

	public boolean isWon() {
		return guessNumber == randomNumber;
	}

	/** Returns random number from minNumber to maxNumber */
	private int getRandomNumber() {
		return new Random().nextInt((maxNumber - minNumber) + 1) + minNumber;
	}

}
