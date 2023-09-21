/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4exercise4andal;
    
import java.util.Scanner;

/**
 *
 * @author Aaron Enrico Andal
 */
public class CS4Exercise4Andal {

    public static void main(String[] args) {
        int opponentMoveNumber;
        Move opponentMove;
        Move playerMove;
        boolean running = true;

        Scanner scan = new Scanner(System.in);
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper", rock);
        Move scissors = new Move("Scissors", paper);
        Move autoTie = new Move("nothing");
        rock.setStrongAgainst(scissors);
        
        int roundsToWin = 2;
        
        while (running) {
            
        int playerWins = 0, computerWins = 0;
            
        System.out.println("\nWelcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start Game");
        System.out.println("2. Change Number of Rounds");
        System.out.println("3. Exit Application");
        
        int choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                
                System.out.printf("\nThis match will be firt to %d wins!", roundsToWin);
                
                while ((roundsToWin > playerWins) && (roundsToWin > computerWins)) {
                    
                
                System.out.println("\nChoose your champion!");
                System.out.println("1. Rock");
                System.out.println("2. Paper");
                System.out.println("3. Scissors");
                
                int moveChoice = scan.nextInt();
                
                switch (moveChoice) {
                    
                    case 1:
                        playerMove = rock;
                        break;
                        
                    case 2:
                        playerMove = paper;
                        break;
                        
                    case 3:
                        playerMove = scissors;
                        break;
                        
                    default:
                        playerMove = autoTie;
                        System.out.println("That is not a valid response!");
                }
                
                opponentMoveNumber = (int) Math.floor(Math.random() * 3 + 1);
                
                switch (opponentMoveNumber) {
                    
                    case 1:
                        opponentMove = rock;
                        break;
                        
                    case 2:
                        opponentMove = paper;
                        break;
                        
                    case 3:
                        opponentMove = scissors;
                        break;
                        
                    default:
                        opponentMove = rock;
                        
                }
                switch (Move.compareMoves(playerMove, opponentMove)) {
                    
                    case 1:
                        System.out.println("\nPlayer Plays " + playerMove.getName() +", Computer plays " + opponentMove.getName() + ", you tie!");
                        System.out.printf("You: %d - Computer %d\n", playerWins, computerWins);
                        break;
                        
                    case 2:
                        System.out.println("\nPlayer Plays " + playerMove.getName() +", Computer plays " + opponentMove.getName() + ", you lose!");
                        computerWins++;
                        System.out.printf("You: %d - Computer %d\n", playerWins, computerWins);
                        break;
                        
                    case 0:
                        System.out.println("\nPlayer Plays " + playerMove.getName() +", Computer plays " + opponentMove.getName() + ", you win!");
                        playerWins++;
                        System.out.printf("You: %d - Computer %d\n", playerWins, computerWins);
                        break;
                        
                }
                
                }
                
                if (playerWins >= roundsToWin) 
                    System.out.println("\nYou Win!");
                else if (computerWins >= roundsToWin)
                    System.out.println("\nComputer Wins!");
                
                break;
                
            case 2:
                System.out.println("You chose to change number of rounds!");
                System.out.println("How many wins does a player need to win?");
                roundsToWin = scan.nextInt();
                System.out.printf("\nYou now need to win %d rounds to win the game!\n", roundsToWin);
                break;
                
            case 3:
                
                System.out.println("Thanks for playing!");
                running = false;
                System.exit(0);
                break;
                
            default:
                System.out.println("The input you have given is not valid. Please do better next time... or else.");
        }
    }
    }
    
}
