
/**
 * Write a description of class Rook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rook extends BasePiece
{
    Rook(Piece.Color color, int[] where) {
        super(Piece.PieceType.ROOK, color, where);
    }
    
    Rook(Piece.Color color) {
        super(Piece.PieceType.ROOK, color, new int[]{-1,-1});
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'R';
    }
}
