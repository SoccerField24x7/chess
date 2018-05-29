
/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends BasePiece
{
    King(Piece.Color color, int[] where) {
        super(Piece.PieceType.KING, color, where);
    }
    
    King(Piece.Color color) {
        super(Piece.PieceType.KING, color, new int[]{-1,-1});
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'K';
    }
}
