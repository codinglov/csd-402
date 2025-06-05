// Create a game of rock paper scissors 
//generate random numbers 1. rock, 2. paper, 3. scissors
//prompt user to enter value 1, 2, or 3
//compare user input to random number
//display both user and computer choices
//display winner
import java.util.Random;
import java.util.Scanner;   

public class MyMainClass {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object for generating computer choices
        Random random = new Random();

        // Prompt user to enter their choice
        int computerSelection = random.nextInt(3) + 1;

         // Prompt user to enter their choice
        System.out.println("Enter your selection: (Please select, 1 for Rock, 2 for Paper, 3 for Scissors)");
        int userChoice = scanner.nextInt();

        // Display both choices
        System.out.println("You selected: " + choiceToString(userChoice));
        System.out.println("The computer selected: " + choiceToString(computerSelection));

        // Determine the winner
        String result = determineWinner(userChoice, computerSelection);
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }

    private static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }

    private static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}