# JavaRoshambo

### This is an assignment for Intro to Computer Science at WNCC Spring 2024

Rock, paper, scissors, also known as Roshambo, is a simple child's game that is frequently used to settle disputes. This Roshambo game is designed to play against the computer. 

In the game, the rock breaks the scissors, the scissors cut the paper, and the paper covers the rock. Each option is equally likely to prevail over another. If the players choose the same object a draw is declared, and the game is repeated until someone prevails.

### Demonstrate an understanding of:
variables, constants, input, decisions

### Minimum Requirements:

You can create this program as a CLI or JOptionPane. 

In the game Rock Paper Scissors, two players simultaneously choose one of three options: rock, paper, or scissors. 
If both players choose the same option, then the result is a tie. 
However, if they choose differently, the winner is determined as follows: 
• Rock beats scissors because a rock can break a pair of scissors. 
• Scissors beats paper because scissors can cut paper. 
• Paper beats rock because a piece of paper can cover a rock. 

### Create a game 
1. The computer randomly chooses rock, paper, or scissors. 
2. Let the user enter a number 1, 2, or 3, each representing one of the three choices. 
3. Determine and display the winner. 
4. Have the computer taunt (make fun of) the user. 
5. Provide user feedback, who chose what, and why they won. 
6. It is better to divide the decisions by using nested if statements.  
a. Decide for one player 
b. Inside of that if statement, decide the other player. 
c. Otherwise, you end up with 9 seemingly unrelated decisions that are harder 
to follow and troubleshoot. 
