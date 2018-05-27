
/**
 * Write a description of interface Piece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Piece
{

    public static enum Color {
        BLACK, WHITE
    }

    public static enum PieceType {
        NONE, PAWN, ROOK, BISHOP, KNIGHT, QUEEN, KING
    }

    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public abstract boolean isValidMove(int[] toLocation); // does this piece actually move that way?
    public abstract boolean canTakePiece(int[] inLocation);
    public boolean doMove(int[] location);
    public String getMarker();
    public Piece.PieceType getPieceType();
    public Piece.Color getPieceColor();
    
}
