/*import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock-Paper-Scissors!");

        // Player 1 input
        System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
        String player1Choice = scanner.nextLine().toLowerCase();

        // Clear screen simulation (optional)
        //for (int i = 0; i < 50; ++i) System.out.println();

        // Player 2 input
        System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
        String player2Choice = scanner.nextLine().toLowerCase();

        System.out.println("Player 1 chose: " + player1Choice);
        System.out.println("Player 2 chose: " + player2Choice);

        // Determine the winner
        if (player1Choice.equals(player2Choice)) {
            System.out.println("It's a tie!");
        } else if (
            (player1Choice.equals("rock") && player2Choice.equals("scissors")) ||
            (player1Choice.equals("paper") && player2Choice.equals("rock")) ||
            (player1Choice.equals("scissors") && player2Choice.equals("paper"))
        ) {
            System.out.println("Player 1 wins!");
        } else if (
            (player2Choice.equals("rock") && player1Choice.equals("scissors")) ||
            (player2Choice.equals("paper") && player1Choice.equals("rock")) ||
            (player2Choice.equals("scissors") && player1Choice.equals("paper"))
        ) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Invalid input! Please use only rock, paper, or scissors.");
        }

        scanner.close();
    }
}*//*
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = scanner.nextLine().toLowerCase();

        // Randomize computer choice
        int computerNumber = random.nextInt(3); // 0, 1, or 2
        String computerChoice = "";

        switch (computerNumber) {
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
        }

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else if (
            (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors"))
        ) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}*/
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        // Random choices for Player 1 and Player 2
        String player1Choice = choices[random.nextInt(3)];
        String player2Choice = choices[random.nextInt(3)];

        System.out.println("Player 1 chose: " + player1Choice);
        System.out.println("Player 2 chose: " + player2Choice);

        // Determine the winner
        if (player1Choice.equals(player2Choice)) {
            System.out.println("It's a tie!");
        } else if (
            (player1Choice.equals("rock") && player2Choice.equals("scissors")) ||
            (player1Choice.equals("paper") && player2Choice.equals("rock")) ||
            (player1Choice.equals("scissors") && player2Choice.equals("paper"))
        ) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
