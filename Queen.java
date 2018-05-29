
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

    private void setMoves(){
        this.validMoves = new int[56][2];
        
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
        
        this.validMoves[28][0] = 1;
        this.validMoves[28][1] = 1;
        
        this.validMoves[29][0] = 2;
        this.validMoves[29][1] = 2;
        
        this.validMoves[30][0] = 3;
        this.validMoves[30][1] = 3;
        
        this.validMoves[31][0] = 4;
        this.validMoves[31][1] = 4;
        
        this.validMoves[32][0] = 5;
        this.validMoves[33][1] = 5;
        
        this.validMoves[33][0] = 6;
        this.validMoves[33][1] = 6;
        
        this.validMoves[34][0] = 7;
        this.validMoves[34][1] = 7;
        
        this.validMoves[35][0] = 1;
        this.validMoves[35][1] = -1;
        
        this.validMoves[36][0] = 2;
        this.validMoves[36][1] = -2;
        
        this.validMoves[37][0] = 3;
        this.validMoves[37][1] = -3;
        
        this.validMoves[38][0] = 4;
        this.validMoves[38][1] = -4;
        
        this.validMoves[39][0] = 5;
        this.validMoves[39][1] = -5;
        
        this.validMoves[40][0] = 6;
        this.validMoves[40][1] = -6;
        
        this.validMoves[41][0] = 7;
        this.validMoves[41][1] = -7;
        
        this.validMoves[42][0] = -1;
        this.validMoves[42][1] = -1;
        
        this.validMoves[43][0] = -2;
        this.validMoves[43][1] = -2;
        
        this.validMoves[44][0] = -3;
        this.validMoves[44][1] = -3;
        
        this.validMoves[45][0] = -4;
        this.validMoves[45][1] = -4;
        
        this.validMoves[46][0] = -5;
        this.validMoves[46][1] = -5;
        
        this.validMoves[47][0] = -6;
        this.validMoves[47][1] = -6;
        
        this.validMoves[48][0] = -7;
        this.validMoves[48][1] = -7;

        this.validMoves[49][0] = -1;
        this.validMoves[49][1] = 1;
        
        this.validMoves[50][0] = -2;
        this.validMoves[50][1] = 2;
        
        this.validMoves[51][0] = -3;
        this.validMoves[51][1] = 3;
        
        this.validMoves[52][0] = -4;
        this.validMoves[52][1] = 4;
        
        this.validMoves[53][0] = -5;
        this.validMoves[53][1] = 5;
        
        this.validMoves[54][0] = -6;
        this.validMoves[54][1] = 6;
        
        this.validMoves[55][0] = -7;
        this.validMoves[55][1] = 7;
    }
    
    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'Q';
    }
}
