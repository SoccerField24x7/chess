
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
    public static void main(String[] args) {
        /* create the board */
        Board board = new Board();
        Scanner in = new Scanner(System.in);
        String buf = new String();
        AI computer = new AI();

        board.initBoard();

        board.renderBoard();

    }
}
