/*
 *  Name: Roshambo.java
 *  Created by: Jessica Soler
 *  Date: 9/30/2024
 *  Description: This program is a game of rock, paper, scissors. The user will play against the computer. 
 *  Purpose: demonstrate understanding of variables, constants, inputs, decisions, loops
 */


 import javax.swing.JOptionPane;
 import java.util.Random;
 
 public class Roshambo {
     public static void main(String[] args) {
         boolean playAgain = true;
 
         while (playAgain) {
             // pop up box to welcome user to the game
             JOptionPane.showMessageDialog(null, "Let's Play Rock, Paper, Scissors!"); 
 
             // when user selects "OK" the game will start
             JOptionPane.showMessageDialog(null, "You will play against the computer. \nPlease enter your choice of rock, paper, or scissors.");
 
             // user enters choice
             String userChoice = JOptionPane.showInputDialog("Enter your choice: rock, paper, or scissors");
 
             // computer generates random choice
             String computerChoice = "";
             int randomNumber = new Random().nextInt(3) + 1; // Generates a random number between 1 and 3, *AI CODE SNIPET*
             if (randomNumber == 1) {
                 computerChoice = "rock";
             } else if (randomNumber == 2) {
                 computerChoice = "paper";
             } else {
                 computerChoice = "scissors";
             }
 
             // display user choice and computer choice
             JOptionPane.showMessageDialog(null, "You chose: " + userChoice + "\nComputer chose: " + computerChoice);
 
            // determine winner
            if (userChoice.equals("rock") && computerChoice.equals("rock")) {
                JOptionPane.showMessageDialog(null, "It's a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
                JOptionPane.showMessageDialog(null, "Computer wins!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
                JOptionPane.showMessageDialog(null, "You win!");
            } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
                JOptionPane.showMessageDialog(null, "You win!");
            } else if (userChoice.equals("paper") && computerChoice.equals("paper")) {
                JOptionPane.showMessageDialog(null, "It's a tie!");
            } else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
                JOptionPane.showMessageDialog(null, "Computer wins!");
            } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
                JOptionPane.showMessageDialog(null, "Computer wins!");
            } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
                JOptionPane.showMessageDialog(null, "You win!");
            } else if (userChoice.equals("scissors") && computerChoice.equals("scissors")) {
                JOptionPane.showMessageDialog(null, "It's a tie!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter rock, paper, or scissors.");
            }

            // The user will be asked if they would like to play again.
            int response = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Roshambo", JOptionPane.YES_NO_OPTION);

            // If the user selects "No", the game will end.
            if (response != JOptionPane.YES_OPTION) {
                playAgain = false;
                JOptionPane.showMessageDialog(null, "Goodbye!");
            }
        }
    }
}