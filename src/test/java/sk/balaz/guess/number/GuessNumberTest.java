package sk.balaz.guess.number;

import org.junit.Test;

public class GuessNumberTest  {
	
	@Test
	public void testIdealRun() {
		GuessNumber guessNumber = new GuessNumber();
		
		while(!guessNumber.isWon()) {
			guessNumber.guess(1);
		}
	}
}
