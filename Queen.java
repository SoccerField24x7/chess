
/**
 * Write a description of class Queen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queen extends BasePiece
{
    Queen(Piece.Color color, int[] where) {
        super(Piece.PieceType.QUEEN, color, where);
    }
    
    Queen(Piece.Color color) {
        super(Piece.PieceType.QUEEN, color, new int[]{-1,-1});
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'Q';
    }
}
