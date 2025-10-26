import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    Scanner scanner = new Scanner(System.in);
    public enum GameState{
        play,
        end;
    }


    public int getTargetNumber() {
        return targetNumber;
    }

    private int targetNumber;
    private int guessedNumber;
    private int numberOfAttempts;
    private Random random = new Random();
    private int replay;

    public GuessGame(){
        targetNumber= random.nextInt(100);
    }


    public void start(){
        GameState gameState =GameState.play;
//        System.out.println("Target Number is :"+getTargetNumber());
        System.out.println("Choose you game Difficulty : 1.easy 2.medium 3.Hard");
        numberOfAttempts=chooseGameDifficulty();
        System.out.println("you have "+numberOfAttempts+"Attempts left");
        while(numberOfAttempts>0 && gameState==GameState.play){
            System.out.println("Enter the Guessed Number : ");
            guessedNumber= scanner.nextInt();
            if(guessedNumber==targetNumber){
                System.out.println("You have won the Game!");
                gameState=GameState.end;
                break;
            } else if (guessedNumber<targetNumber) {
                System.out.println("Guesed number is less than target number ");
            }
            else{
                System.out.println("Guessed Number is greater than target number");
            }
            numberOfAttempts--;
            System.out.println("you have "+numberOfAttempts+" attempts left");
            if(numberOfAttempts==0){
                System.out.println("Your Number was :"+targetNumber);
            }

        }
        System.out.println("Would you like to play again? press 1 for yes 2 for No");
        replay=scanner.nextInt();
        if(replay==1){
            targetNumber=random.nextInt(100);
            start();
        }

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
