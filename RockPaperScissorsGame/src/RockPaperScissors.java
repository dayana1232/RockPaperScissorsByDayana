import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";
        // prompts user for input
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String gamerChoice = scanner.nextLine();
        // checks the user's input
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
        // creates a random integer in the range form 0 to 3 exclusive
        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        // checks the computer's move
        String computerMove;
        if (computerRandomNumber == 0){
            computerMove = rock;
        } else if ( computerRandomNumber == 1) {
            computerMove = paper;
        }else {
            computerMove= scissors;
        }
        // prints the choice of the computer
        System.out.printf("The computer choose %s.%n", computerMove);
        // reveal the winner based of the game's rules
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
