
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

        this.setMoves();
    }
    Knight(Piece.Color color) {
        super(Piece.PieceType.KNIGHT, color, new int[]{-1,-1});  //no location specified, don't put it on the board.
        this.setMoves();
    }

    private void setMoves() {
        //knights move weird, so let's map them out
        //-2, +1  (two left, 1 up)
        //-1, +2  (one left, 2 up)
        //1, 2 (one right, 2 up)
        //2, 1 (two right, 1 up)
        //1, -2 (one right, 2 down)
        //2, -1 (two right, 1 down)
        //-2, -1 (two left, 1 down)
        //-1, -2 (one left, 2 down)

        //allocate memory
        this.validMoves = new int[8][2];  //eight moves, each has two coordinates (y/x)

        //let's translate that to the possible moves
        this.validMoves[0][0] = -2;  //first move
        this.validMoves[0][1] = 1;

        this.validMoves[1][0] = -1; //second move
        this.validMoves[1][1] = 2;

        this.validMoves[2][0] = 1; //third move
        this.validMoves[2][1] = 2;

        this.validMoves[3][0] = 2; //fourth
        this.validMoves[3][1] = 1;

        this.validMoves[4][0] = 1; //fifth
        this.validMoves[4][1] = -2;

        this.validMoves[5][0] = 2; //sixth
        this.validMoves[5][1] = -1;

        this.validMoves[6][0] = -2; //seventh
        this.validMoves[6][1] = -1;

        this.validMoves[7][0] = -1; //eighth
        this.validMoves[7][1] = -2;
    }

    public String getMarker() {
        String color = this.pieceColor == Piece.Color.BLACK ? "b" : "w";
        return color + 'k';
    }
}
