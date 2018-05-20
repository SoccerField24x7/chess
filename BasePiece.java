
/**
 * Abstract class BasePiece - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class BasePiece implements Piece
{
    String[] location;
    int pieceType;
    
    BasePiece(int pieceType, String[] where) {
        this.pieceType = pieceType;
        this.location = where;
    }
    
    public Boolean isValidMove(BasePiece piece, String[] move)
    {
        return true;
    }
}
