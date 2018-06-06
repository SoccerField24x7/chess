
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
    private static Piece.Color turn = Piece.Color.WHITE;
    
    public static void main(String[] args) {
        /* create the board */
        Board board = Board.getInstance();
        Scanner in = new Scanner(System.in);
        String buf = new String();
        String input1 = new String();
        String input2 = new String();
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        AI computer = new AI();  
        boolean gameOver = false;
        
        board.renderBoard();
        
        System.out.println("\nWelcome to Chess!  Player using the WHITE pieces will go first (wX)");

        //while loop (while game not over)
        while (!gameOver){
                      
            System.out.println("Enter coordinates (i.e. A, 1) for the piece you want move");
            input1 = in.nextLine();
            
            System.out.println("Enter the coordinates (i.e. A, 2) for the piece destination");
            input2 = in.nextLine();
            
            input1 = input1.replaceAll("\\s+","");
            input2 = input2.replaceAll("\\s+","");
            
            x1 = convertFromString(input1);
            x2 = convertFromString(input2);
            
            y1 = Character.getNumericValue(input1.charAt(2));
            y2 = Character.getNumericValue(input2.charAt(2));
            
            System.out.println("\n");

            Piece.PieceType square = board.getSquareValue(coordinates(x1,y1));
            if (square == Piece.PieceType.NONE){
                System.out.println("No piece at that location, try another location.");
                continue;
                /*input1 = in.nextLine();
                System.out.println("And where do you want to move?");
                input2 = in.nextLine();
                
                input1 = input1.replaceAll("\\s+","");
                input2 = input2.replaceAll("\\s+","");
                
                x1 = convertFromString(input1);
                x2 = convertFromString(input2);
            
                y1 = Character.getNumericValue(input1.charAt(2));
                y2 = Character.getNumericValue(input2.charAt(2));
                
                square = board.getSquareValue(coordinates(x1,y1));*/
            }
            
            BasePiece thisPiece = board.getSquarePiece(new int[]{x1,y1});
            if(thisPiece.pieceColor != turn){
                System.out.println("This is not your piece.");
                continue;
            }
                
            /*if(thisPiece == null) {
                System.out.println("There isn't a piece on those coordinates");
                //System.exit(0);
            }*/
            
            //get an actual piece
            thisPiece = board.getSquarePiece(new int[]{x1,y1});
            
            System.out.println("String representation of the piece: " + thisPiece.getMarker());
            System.out.println("Piece Type: " + thisPiece.getPieceType());
    
            //now let's test the proper method with a good move
            if(thisPiece.isValidMove(coordinates(x2,y2))) {
                System.out.println("got a good move");
            }
    
            //and a bad move
            if(!thisPiece.isValidMove(coordinates(x2,y2))) {
                System.out.println("Piece cannot move there!");
                continue;                
            }
               
            //now, let's really move a piece
            if(!board.makeMove(coordinates(x1,y1), coordinates(x2, y2))){
               System.out.println("Invalid move.");
               continue;
            }  

            //and move the white pawn to counter
            //board.makeMove(new int[]{1,3}, new int[]{3,3});  //specifying coordintes by hand
    
            board.renderBoard();
            switchTurn();
            //validate move possible
    
            //make sure making this move doesn't expose your king (invalid)
    
            //determine if there is a piece there
    
            //is the piece you're moving capable of taking a piece this way (i.e. pawn can only take diagonally)
    
            //if you took a piece, move to gutter
    
            //update the move array
    
            //re-render the board
        }
    }

    /**
     * This converts the y and x coordinates used to specify a move into an integer array "location"
     * @param y
     * @param x
     * @return
     */

    private static int convertFromString(String s){
        int x = -1;
        
        if(s.charAt(0) == 'A'){
            x = 0;
        } else if (s.charAt(0) == 'B'){
            x = 1;
        } else if (s.charAt(0) == 'C'){
            x = 2;
        } else if (s.charAt(0) == 'D'){
            x = 3;
        } else if (s.charAt(0) == 'E'){
            x = 4;
        } else if (s.charAt(0) == 'F'){
            x = 5;
        } else if (s.charAt(0) == 'G'){
            x = 6;
        } else if (s.charAt(0) == 'H'){
            x = 7;
        }
        
        return x;
    }
    
    private static int[] coordinates(int y, int x) {
        return new int[] {y, x};
    }
    
    private static void switchTurn(){
        if(turn == Piece.Color.WHITE){
            turn = Piece.Color.BLACK;
            System.out.println("Black's turn");
        }   
        else
        {
            turn = Piece.Color.WHITE;
            System.out.println("White's turn");
        }
    }
}
