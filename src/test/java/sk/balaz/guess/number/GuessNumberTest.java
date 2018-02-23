package sk.balaz.guess.number;

import org.junit.Test;

public class GuessNumberTest  {
	
	@Test
	public void testIdealRun() {
		TextGuessNumber guessNumber = new TextGuessNumber();
		
		while(!guessNumber.isWon()) {
			guessNumber.guess(1);
		}
	}
}
