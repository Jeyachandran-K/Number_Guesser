import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    Scanner scanner = new Scanner(System.in);


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

        System.out.println("Choose you game Difficulty : 1.easy 2.medium 3.Hard");
        numberOfAttempts=chooseGameDifficulty();
        System.out.println("you have "+numberOfAttempts+"Attempts left");
    }
    public int chooseGameDifficulty(){

        int selectedNum=scanner.nextInt();

        switch(selectedNum){
            case 1 :
                return 9;
            case 2:
                return 6;
            case 3:
                return 3;

            default:
                System.out.println("Enter a given option :");
                chooseGameDifficulty();
                return 0;

        }

    }

}
