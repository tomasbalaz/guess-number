package sk.balaz.guess.number;

public interface GuessNumber {

	public GuessStatus guess(int guessNumber);

	public boolean isWon();
}
