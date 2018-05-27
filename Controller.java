
/**
 * This is the driver of the game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.Scanner;

public class Controller
{
    public int whoseTurn = 1;
    
    public static void main(String[] args) {
        /* create the board */
        Board board = new Board();
        Scanner in = new Scanner(System.in);
        String buf = new String();
        AI computer = new AI();

        board.renderBoard();
        
        System.out.println("\nWelcome to Chess!  Pleyer using the WHITE pieces will go first (wX)");

        //while loop (while game not over)

        System.out.println("Enter coordinates (i.e. A, 1) for the piece you want move");
        //take input

        System.out.println("Enter the coordinates (i.e. A, 2) for the piece destination");
        //take input
        
        /*** these are just tests to see if/how things work ***/
        System.out.println("\n");
        boolean result = board.makeMove(new int[]{3,0}, new int[]{3,2});
        if(!result) {
            System.out.println("There wasn't a piece there to move");
            //System.exit(0);
        }
        
        BasePiece thisPiece = board.getSquarePiece(new int[]{3,1});
        if(thisPiece == null) {
            System.out.println("There isn't a piece on those coordinates");
            //System.exit(0);
        }
        
        //get an actual piece (pawn)
        thisPiece = board.getSquarePiece(new int[]{6,3});
        System.out.println("String representation of the piece: " + thisPiece.getMarker());
        System.out.println("Piece Type: " + thisPiece.getPieceType());

        //now, let's really move a piece
        board.makeMove(coordinates(6,3), coordinates(4, 3));  //using the prep helper

        //and move the white pawn to counter
        board.makeMove(new int[]{1,3}, new int[]{3,3});  //specifying coordintes by hand

        board.renderBoard();
        
        /*********************** end tests *************************/
        
        //validate move possible

        //make sure making this move doesn't expose your king (invalid)

        //determine if there is a piece there

        //is the piece you're moving capable of taking a piece this way (i.e. pawn can only take diagonally)

        //if you took a piece, move to gutter

        //update the move array

        //re-render the board

    }

    /**
     * This converts the y and x coordinates used to specify a move into an integer array "location"
     * @param y
     * @param x
     * @return
     */

    private static int[] coordinates(int y, int x) {
        return new int[] {y, x};
    }
}
