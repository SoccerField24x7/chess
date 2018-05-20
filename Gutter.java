
/**
 * This is the "cemetery" for all taken pieces.  One per game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gutter
{
    private BasePiece[] whitePieces;
    private BasePiece[] blackPieces;
    private int whiteIndex = 0;
    private int blackIndex = 0;

    public Gutter()
    {
        this.blackPieces = new BasePiece[26]; //giving extra room in the case that pawns are promoted and get retaken in their new incarnation
        this.whitePieces = new BasePiece[26];
    }

    public void addPiece(BasePiece piece, Piece.Color player)
    {
        if(player == Piece.Color.WHITE)
        {
            this.whitePieces[this.whiteIndex++] = piece;
        }
        else
        {
            this.blackPieces[this.blackIndex++] = piece;
        }
    }

    public BasePiece[] getBlackPieces() {
        return blackPieces;
    }

    public BasePiece[] getWhitePieces() {
        return whitePieces;
    }
}
