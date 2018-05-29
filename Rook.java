
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
        
        this.setMoves();
    }
    
    Rook(Piece.Color color) {
        super(Piece.PieceType.ROOK, color, new int[]{-1,-1});
    }
    
    private void setMoves(){
        this.validMoves = new int[28][2];
        
        this.validMoves[0][0] = 1;
        this.validMoves[0][1] = 0;
        
        this.validMoves[1][0] = 2;
        this.validMoves[1][1] = 0;
        
        this.validMoves[2][0] = 3;
        this.validMoves[2][1] = 0;
        
        this.validMoves[3][0] = 4;
        this.validMoves[3][1] = 0;
        
        this.validMoves[4][0] = 5;
        this.validMoves[4][1] = 0;
        
        this.validMoves[5][0] = 6;
        this.validMoves[5][1] = 0;
        
        this.validMoves[6][0] = 7;
        this.validMoves[6][1] = 0;
        
        this.validMoves[7][0] = 0;
        this.validMoves[7][1] = 1;
        
        this.validMoves[8][0] = 0;
        this.validMoves[8][1] = 2;
        
        this.validMoves[9][0] = 0;
        this.validMoves[9][1] = 3;
        
        this.validMoves[10][0] = 0;
        this.validMoves[10][1] = 4;
        
        this.validMoves[11][0] = 0;
        this.validMoves[11][1] = 5;
        
        this.validMoves[12][0] = 0;
        this.validMoves[12][1] = 6;
        
        this.validMoves[13][0] = 0;
        this.validMoves[13][1] = 7;
        
        this.validMoves[14][0] = -1;
        this.validMoves[14][1] = 0;
        
        this.validMoves[15][0] = -2;
        this.validMoves[15][1] = 0;
        
        this.validMoves[16][0] = -3;
        this.validMoves[16][1] = 0;
        
        this.validMoves[17][0] = -4;
        this.validMoves[17][1] = 0;
        
        this.validMoves[18][0] = -5;
        this.validMoves[18][1] = 0;
        
        this.validMoves[19][0] = -6;
        this.validMoves[19][1] = 0;
        
        this.validMoves[20][0] = -7;
        this.validMoves[20][1] = 0;

        this.validMoves[21][0] = 0;
        this.validMoves[21][1] = -1;
        
        this.validMoves[22][0] = 0;
        this.validMoves[22][1] = -2;
        
        this.validMoves[23][0] = 0;
        this.validMoves[23][1] = -3;
        
        this.validMoves[24][0] = 0;
        this.validMoves[24][1] = -4;
        
        this.validMoves[25][0] = 0;
        this.validMoves[25][1] = -5;
        
        this.validMoves[26][0] = 0;
        this.validMoves[26][1] = -6;
        
        this.validMoves[27][0] = 0;
        this.validMoves[27][1] = -7;
    }
    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'R';
    }
}
