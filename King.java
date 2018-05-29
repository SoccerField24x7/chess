
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
        
        this.setMoves();
    }
    
    King(Piece.Color color) {
        super(Piece.PieceType.KING, color, new int[]{-1,-1});
    }

    private void setMoves(){
        this.validMoves = new int[8][2];
        
        this.validMoves[0][0] = 1;
        this.validMoves[0][1] = 0;
        
        this.validMoves[1][0] = -1;
        this.validMoves[1][1] = 0;
        
        this.validMoves[2][0] = 1;
        this.validMoves[2][1] = 1;
        
        this.validMoves[3][0] = 1;
        this.validMoves[3][1] = -1;
        
        this.validMoves[4][0] = -1;
        this.validMoves[4][1] = 1;
        
        this.validMoves[5][0] = 0;
        this.validMoves[5][1] = -1;
        
        this.validMoves[6][0] = -1;
        this.validMoves[6][1] = -1;
        
        this.validMoves[7][0] = 0;
        this.validMoves[7][1] = 1;
    }
    
    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'K';
    }
}
