
/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends BasePiece
{
    Pawn(Piece.Color color, int[] where) {
        super(Piece.PieceType.PAWN, color, where);
    }
    Pawn(Piece.Color color) {
        super(Piece.PieceType.PAWN, color, new int[]{-1,-1});
    }

    public boolean isValidMove(int[] move) {

        return false;
    }

    public boolean canTakePiece(int[] location) {

        return false;
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'P';
    }
}
