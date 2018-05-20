
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    private int[][] board; // keeps track of where the pieces are
    private int[][] game; // keeps track of the moves made
    private int moveNo;
    private boolean gameOver;
    public final int BOARD_SIZE_WIDTH = 8;
    public final int BOARD_SIZE_HEIGHT = 8;
    public final int MAX_MOVES = 1000;  // research what an average chess game lasts.
    public final int OPEN = 0;

    Board() {
        this.board = new int[BOARD_SIZE_HEIGHT][BOARD_SIZE_WIDTH];
        this.initBoard();
    }

    public void initBoard() {
        this.gameOver = false;
        this.moveNo = 0;
        this.game = new int[MAX_MOVES][3];

        for(int i=0 ; i < BOARD_SIZE_HEIGHT ; i++) {
            for(int x=0 ; x < BOARD_SIZE_WIDTH ; x++) {
                board[i][x] = 0;
            }
        }
    }

    public void renderBoard() {
        /* print header row */
        //System.out.printf("%s%3s%3s%3s%3s%3s%3s%3s%3s%3s%3s%3s%3s\n", "|  0","|","1","|","2","|","3","|","4","|","5","|","  6  |"); //this needs to be modified to fit chess (top, bottom)

        /* now print each subsequent row */
        for(int i=0 ; i < BOARD_SIZE_HEIGHT ; i++) {
            for(int x=0 ; x < BOARD_SIZE_WIDTH ; x++) {
                if(x == 0) {
                    System.out.print("|");
                }
                System.out.printf("%3s  |", getSquareChar(board[i][x]));
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
    public int getSquare(int row, int col) {
        return board[row][col];
    }

    /**
     * Converts the games values into their character representation.
     *
     * @param  val   value currently occupying a square
     * @return     Character representation of a value.
     */
    private char getSquareChar(int val) { // TODO: update for all of the possible pieces and player
        switch(val) {
            case X:
                return 'R';
            case O:
                return 'Y';
            case 9:
                return '*';
        }
        return ' ';
    }
}
