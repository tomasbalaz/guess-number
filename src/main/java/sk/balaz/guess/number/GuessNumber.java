package sk.balaz.guess.number;

import java.util.Random;

public class GuessNumber {

	private static final int MIN_NUMBER_DEFAULT = 10;
	
	private static final int MAX_NUMBER_DEFAULT = 1;
	
	private int minNumber = MIN_NUMBER_DEFAULT;
	
	private int maxNumber = MAX_NUMBER_DEFAULT;
	
	private int randomNumber;
	
	public GuessNumber() {
		randomNumber = getRandomNumber();
	}

	public void guess(int guessNumber) {

	}

	public boolean isWon() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private int getRandomNumber() {
		return new Random().nextInt((maxNumber - minNumber) + 1) + minNumber;
	}

}
