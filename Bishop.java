
/**
 * Write a description of class Bishop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bishop extends BasePiece
{
    Bishop(Piece.Color color, int[] where) {
        super(Piece.PieceType.BISHOP, color, where);
    }
    Bishop(Piece.Color color) {
        super(Piece.PieceType.BISHOP, color, new int[]{-1,-1});        
    }
    
    public boolean isValidMove(int[] move) {
        
        return false;
    }
    
    public boolean canTakePiece(int[] location) {
        
        return false;
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'B';
    }
}
