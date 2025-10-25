import java.util.Random;

public class GuessGame {
    public int getTargetNumber() {
        return targetNumber;
    }

    private int targetNumber;
    private int guessedNumber;
    private int numberOfAttempts;
    private Random random = new Random();

    public GuessGame(){
        targetNumber= random.nextInt(100);
    }


    public void start(){

    }

}
