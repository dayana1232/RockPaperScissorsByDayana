import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String gamerChoice = scanner.nextLine();
        String gamerMove;
        if (gamerChoice.equals("r") || gamerChoice.equals("rock")){
            gamerMove = rock;
        } else if (gamerChoice.equals("p") || gamerChoice.equals("paper")) {
            gamerMove = paper;
        } else if (gamerChoice.equals("s") || gamerChoice.equals("scissors")) {
            gamerMove = scissors;
        }else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computerMove;
        if (computerRandomNumber == 0){
            computerMove = rock;
        } else if ( computerRandomNumber == 1) {
            computerMove = paper;
        }else {
            computerMove= scissors;
        }
        System.out.printf("The computer choose %s.%n", computerMove);
        if (gamerMove.equals(computerMove)){
            System.out.println("This game was a draw.");
        } else if (gamerMove.equals(rock) && computerMove.equals(paper)
                || gamerMove.equals(scissors) && computerMove.equals(rock)
                || gamerMove.equals(paper) && computerMove.equals(scissors)) {
            System.out.println("You lose.");
        }else {
            System.out.println("You win.");
        }

    }
}
