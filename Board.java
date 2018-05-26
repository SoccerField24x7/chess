
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    private BasePiece[][] board; // keeps track of where the pieces are
    private int[][] game; // keeps track of the moves made
    private int moveNo;
    private boolean gameOver;
    public final int BOARD_SIZE_WIDTH = 8;
    public final int BOARD_SIZE_HEIGHT = 8;
    public final int MAX_MOVES = 1000;  // research what an average chess game lasts.
    public final int OPEN = 0;

    Board() {
        this.board = new Piece.PieceType[BOARD_SIZE_HEIGHT][BOARD_SIZE_WIDTH];
        this.initBoard();
    }

    public void initBoard() {
        this.gameOver = false;
        this.moveNo = 0;
        this.game = new int[MAX_MOVES][3];

        for(int i=0 ; i < BOARD_SIZE_HEIGHT ; i++) {
            for(int x=0 ; x < BOARD_SIZE_WIDTH ; x++) {
                board[i][x] = Piece.PieceType.NONE;
            }
        }

        /* add white pieces to the board */
        board[0][0] = Piece.PieceType.wROOK;
        board[0][1] = Piece.PieceType.wKNIGHT;
        board[0][2] = Piece.PieceType.wBISHOP;
        board[0][3] = Piece.PieceType.wQUEEN;
        board[0][4] = Piece.PieceType.wKING;
        board[0][5] = Piece.PieceType.wBISHOP;
        board[0][6] = Piece.PieceType.wKNIGHT;
        board[0][7] = Piece.PieceType.wROOK;

        board[1][0] = Piece.PieceType.wPAWN;
        board[1][1] = Piece.PieceType.wPAWN;
        board[1][2] = Piece.PieceType.wPAWN;
        board[1][3] = Piece.PieceType.wPAWN;
        board[1][4] = Piece.PieceType.wPAWN;
        board[1][5] = Piece.PieceType.wPAWN;
        board[1][6] = Piece.PieceType.wPAWN;
        board[1][7] = Piece.PieceType.wPAWN;

         add black pieces to the board
        board[7][0] = Piece.PieceType.bROOK;
        board[7][1] = Piece.PieceType.bKNIGHT;
        board[7][2] = Piece.PieceType.bBISHOP;
        board[7][3] = Piece.PieceType.bQUEEN;
        board[7][4] = Piece.PieceType.bKING;
        board[7][5] = Piece.PieceType.bBISHOP;
        board[7][6] = Piece.PieceType.bKNIGHT;
        board[7][7] = Piece.PieceType.bROOK;

        board[6][0] = Piece.PieceType.bPAWN;
        board[6][1] = Piece.PieceType.bPAWN;
        board[6][2] = Piece.PieceType.bPAWN;
        board[6][3] = Piece.PieceType.bPAWN;
        board[6][4] = Piece.PieceType.bPAWN;
        board[6][5] = Piece.PieceType.bPAWN;
        board[6][6] = Piece.PieceType.bPAWN;
        board[6][7] = Piece.PieceType.bPAWN;


    }

    public void renderBoard() {
        int rowMarker = 65;
        /* print header row */
        System.out.printf("%3s%3s%3s%4s%3s%4s%3s%4s%3s%4s%3s%4s%3s%4s%3s%4s%3s\n", "      ","|   0","|"," 1","|"," 2","|"," 3","|"," 4","|"," 5","|"," 6","|"," 7","|"); //this needs to be modified to fit chess (top, bottom)

        /* now print each subsequent row */
        for(int i=0 ; i < BOARD_SIZE_HEIGHT ; i++) {
            System.out.printf("|%3s  ", Character.toString((char)rowMarker++));
            for(int x=0 ; x < BOARD_SIZE_WIDTH ; x++) {
                if(x == 0) {
                    System.out.print("|");
                }
                System.out.printf("%4s  |", getSquareChar(board[i][x]));
            }
            System.out.print("\n");
        }
    }

    /**
     * Returns the piece located at the coordinates.
     *
     * @param  col
     * @param  rows
     * @return  array Value for coordinates.
     */
    public Piece.PieceType getSquare(int row, int col) {

        return this.board[row][col];
    }

    /**
     * Converts the games values into their character representation.
     *
     * @param  val   value currently occupying a square
     * @return     Character representation of a value.
     */
    private String getSquareChar(Piece.PieceType val) { // TODO: update for all of the possible pieces and player
        switch(val) {
            case wKING:
                return "wK";
            case wQUEEN:
                return "wQ";
            case wBISHOP:
                return "wB";
            case wROOK:
                return "wR";
            case wKNIGHT:
                return "wK";
            case wPAWN:
                return "wP";
            case bKING:
                return "bK";
            case bQUEEN:
                return "bQ";
            case bBISHOP:
                return "bB";
            case bROOK:
                return "bR";
            case bKNIGHT:
                return "bK";
            case bPAWN:
                return "bP";
        }
        return "  ";
    }
}
