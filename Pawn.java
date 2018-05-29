
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
        
        this.setMoves();
    }
    Pawn(Piece.Color color) {
        super(Piece.PieceType.PAWN, color, new int[]{-1,-1});
    }
    
    private void setMoves(){
        this.validMoves = new int[4][2];
        
        this.validMoves[0][0] = this.pieceColor == Piece.Color.BLACK ? 1 : -1;
        this.validMoves[0][1] = 0;
        
        //TODO: disable after initial move
        this.validMoves[1][0] = this.pieceColor == Piece.Color.BLACK ? 2 : -2;
        this.validMoves[1][1] = 0;
        
        this.validMoves[2][0] = this.pieceColor == Piece.Color.BLACK ? 1 : -1;
        this.validMoves[2][1] = 1;
        
        this.validMoves[3][0] = this.pieceColor == Piece.Color.BLACK ? 1 : -1;
        this.validMoves[3][1] = -1;
    }

    public boolean canTakePiece(int[] location) {
        for(int i=2; i < this.validMoves.length; i++) {
            if(isTargetMatch(this.location, location, this.validMoves[i])) {
                return true;
            }
        }
        return false;
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'P';
    }
}
