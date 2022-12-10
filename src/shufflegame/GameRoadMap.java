package shufflegame;

public interface GameRoadMap {

    public int[] shuffleGame(int[] array);

    public String playerGuess();

    public void checkGuess(int[] shuffledArray, int playerGuess);

    public void play();

}
