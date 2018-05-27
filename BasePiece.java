
/**
 * Abstract class BasePiece - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BasePiece implements Piece
{
    public Piece.PieceType pieceType;
    public Piece.Color pieceColor;
    public boolean canMoveBackward = true;
    public int[][] validMoves; // first [] contains "move index", second [] contains: 0-column, 1-row
    public int[] location; //index 0 = column, index 1 = row
    public boolean hasMoved = false;
    public int maxSpaces = 8; // how many spaces can the piece move? 8 = unlimited

    BasePiece(Piece.PieceType pieceType, Piece.Color color, int[] where) {
        this.pieceType = pieceType;
        this.pieceColor = color;
        //this.location = new int[2]; //allocate memory
        this.location = where;

        if(this.pieceType == Piece.PieceType.PAWN) {
            this.canMoveBackward = false;
            this.maxSpaces = 2;
        }
        if(this.pieceType == Piece.PieceType.KNIGHT) {
            this.maxSpaces = 3;
        }
    }

    public boolean doMove(int[] location) {
        this.location = location;
        this.hasMoved = true;

        if(this.pieceType == Piece.PieceType.PAWN) {
            this.maxSpaces = 1;
        }

        return true;
    }

    public Piece.PieceType getPieceType() {
        return this.pieceType;
    }

    public Piece.Color getPieceColor() {
        return this.pieceColor;
    }
    
}
