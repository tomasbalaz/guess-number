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
	 * Default constructor which generates number for guessing from interval :
	 * <1,10>
	 * 
	 */
	public TextGuessNumber() {
		randomNumber = getRandomNumber();
	}

	public TextGuessNumber(int minNumber, int maxNumber) {
		if (maxNumber < minNumber) {
			throw new IllegalArgumentException("Maximum value can not be less than Minimum value");
		}
		this.minNumber = minNumber;
		this.maxNumber = maxNumber;
		randomNumber = getRandomNumber(minNumber, maxNumber);
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
		return getRandomNumber(minNumber, maxNumber);
	}

	/** Returns random number from minNumber to maxNumber */
	private int getRandomNumber(int minNumber, int maxNumber) {
		return new Random().nextInt((maxNumber - minNumber) + 1) + minNumber;
	}

}
