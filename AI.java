
/**
 * Write a description of class AI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AI
{
    String[] getBestMove(Boolean inCheck) {
        //if inCheck == true, you have to defend the check
        
        String[] answer = new String[2];  // i.e. [A,3]
        return answer;
    };
    
    String[] predictOpponentsNextMove() {
        String[] answer = new String[2];  // i.e. [B,6]
        return answer;
    }
    
    /**
     * Passing in a Board, either the actual, or a fictitious board containing a projected move.
     * Determine if "who" (them, us) has their King in check.
     */
    String[] inCheck(Board gameBoard, int who) {
        String[] answer = new String[2];  // i.e. [F,3]
        return answer;
    }
    
    /**
     * The King is the most important piece, we need to know where he is at all times
     */
    String[] whereIsKing(int who) {
        String[] answer = new String[2];  // i.e. [C,8]
        return answer;
    }
    
    /**
     * Find the highest value target that can be taken
     */
    String[] highestValuePieceExposed(int who) {
        String[] answer = new String[2];  // i.e. [D,7]
        return answer;
    }
    
    /**
     * Is the piece at these coordinates currently vulnerable?
     */
    Boolean isExposed(String[] coord) {
        Boolean isVulnerable = false;
        return isVulnerable;
    }
    
    Boolean moveToGutter(BasePiece piece) {
        Gutter gutter = getGutter();
        
        //move piece to Guttter
        //if it fails return false
        
        return true;
    }
    
    Gutter getGutter() {
        //determine how to store/retrieve the gutter (Dependency Injection?)
        Gutter gutter = new Gutter();  //replace this what answer from above 
        
        return gutter;
        
    }
}
