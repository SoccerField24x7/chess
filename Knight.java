
/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends BasePiece
{
    Knight(Piece.Color color, int[] where) {
        super(Piece.PieceType.KNIGHT, color, where);
    }
    Knight(Piece.Color color) {
        super(Piece.PieceType.KNIGHT, color, new int[]{-1,-1});  //no location specified, don't put it on the board.
    }

    public boolean isValidMove(int[] move) {

        return false;
    }

    public boolean canTakePiece(int[] location) {

        return false;
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'K';
    }
}
