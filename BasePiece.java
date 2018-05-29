
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

    //from where I am, is location (y,x) possible based on the rule?
    public boolean isTargetMatch(int[] from, int[] target, int[] rule) {
        //determine y,x movement to get to target
        int yDiff = from[0] - target[0];
        int xDiff = from[1] - target[1];

        if(yDiff == rule[0] && xDiff == rule[1]) {

            return true;
        }

        return false;
    }
    
    public boolean isValidMove(int[] move) {

        //iterate the valid moves to see if we have a rule match
        for(int i=0; i < this.validMoves.length; i++) {
            if(isTargetMatch(this.location, move, this.validMoves[i])) {
                return true;
            }
        }

        return false;
    }
    
    public boolean canTakePiece(int[] location) {
        
        return true;
    }
}
