/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4exercise4andal;

/**
 *
 * @author Aaron Enrico Andal
 */
public class Move {
    private final String name;
    private Move strongAgainst;
            
    public Move (String moveName) {
            this.name = moveName;
    }    
    
    public Move (String moveName, Move strongAgainst) {
            this.name = moveName;
            this.strongAgainst = strongAgainst;
    }
    
    public String getName() {
        return name;
    }

    public Move getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(Move strongAgainst) {
        this.strongAgainst = strongAgainst;
    }
    
    public static int compareMoves(Move firstMove, Move secondMove) {
        if (firstMove.strongAgainst == secondMove)
            return 0;
        else if (secondMove.strongAgainst == firstMove)
            return 2;
        else
            return 1;
    }    
    
}
