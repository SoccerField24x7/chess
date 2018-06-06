
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    private static Board instance = new Board();
    
    private Piece.PieceType[][] board; // keeps track of where the pieces are
    private int[][] game; // keeps track of the moves made
    private int moveNo;
    private boolean gameOver;
    private BasePiece[] pieces = new BasePiece[32];
    private int pieceCount = 0;
    public final int BOARD_SIZE_WIDTH = 8;
    public final int BOARD_SIZE_HEIGHT = 8;
    public final int MAX_MOVES = 1000;  // research what an average chess game lasts.
    public final int OPEN = 0;

    private Board() {
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
        //TODO: create factory class
        board[0][0] = Piece.PieceType.ROOK; // place marker on board
        pieces[pieceCount++] = new Rook(Piece.Color.WHITE, new int[] {0,0}); //create piece

        board[0][1] = Piece.PieceType.KNIGHT;
        pieces[pieceCount++] = new Knight(Piece.Color.WHITE, new int[] {0,1});

        board[0][2] = Piece.PieceType.BISHOP;
        pieces[pieceCount++] = new Bishop(Piece.Color.WHITE, new int[] {0,2});

        board[0][3] = Piece.PieceType.QUEEN;
        pieces[pieceCount++] = new Queen(Piece.Color.WHITE, new int[] {0,3});

        board[0][4] = Piece.PieceType.KING;
        pieces[pieceCount++] = new King(Piece.Color.WHITE, new int[] {0,4});

        board[0][5] = Piece.PieceType.BISHOP;
        pieces[pieceCount++] = new Bishop(Piece.Color.WHITE, new int[] {0,5});

        board[0][6] = Piece.PieceType.KNIGHT;
        pieces[pieceCount++] = new Knight(Piece.Color.WHITE, new int[] {0,6});

        board[0][7] = Piece.PieceType.ROOK;
        pieces[pieceCount++] = new Rook(Piece.Color.WHITE, new int[] {0,7});

        board[1][0] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,0});
        board[1][1] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,1});
        board[1][2] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,2});
        board[1][3] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,3});
        board[1][4] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,4});
        board[1][5] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,5});
        board[1][6] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,6});
        board[1][7] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.WHITE, new int[] {1,7});

        /* add black pieces to the board */
        board[7][0] = Piece.PieceType.ROOK;
        pieces[pieceCount++] = new Rook(Piece.Color.BLACK, new int[] {7,0}); //create piece

        board[7][1] = Piece.PieceType.KNIGHT;
        pieces[pieceCount++] = new Knight(Piece.Color.BLACK, new int[] {7,1});
        
        board[7][2] = Piece.PieceType.BISHOP;
        pieces[pieceCount++] = new Bishop(Piece.Color.BLACK, new int[] {7,2});
        
        board[7][3] = Piece.PieceType.QUEEN;
        pieces[pieceCount++] = new Queen(Piece.Color.BLACK, new int[] {7,3});
        
        board[7][4] = Piece.PieceType.KING;
        pieces[pieceCount++] = new King(Piece.Color.BLACK, new int[] {7,4});
        
        board[7][5] = Piece.PieceType.BISHOP;
        pieces[pieceCount++] = new Bishop(Piece.Color.BLACK, new int[] {7,5});
        
        board[7][6] = Piece.PieceType.KNIGHT;
        pieces[pieceCount++] = new Knight(Piece.Color.BLACK, new int[] {7,6});
        
        board[7][7] = Piece.PieceType.ROOK;
        pieces[pieceCount++] = new Rook(Piece.Color.BLACK, new int[] {7,7});

        board[6][0] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,0});
        board[6][1] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,1});
        board[6][2] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,2});
        board[6][3] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,3});
        board[6][4] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,4});
        board[6][5] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,5});
        board[6][6] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,6});
        board[6][7] = Piece.PieceType.PAWN;
        pieces[pieceCount++] = new Pawn(Piece.Color.BLACK, new int[] {6,7});

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
                System.out.printf("%4s  |", getSquareMarker(board[i][x], new int[] {i, x}));
            }
            System.out.print("\n");
        }
    }

    public static Board getInstance(){
        return instance;
    }
    
    /**
     * Returns the piece type located at the coordinates.
     *
     * @param  col
     * @param  rows
     * @return  array Value for coordinates.
     */
    public Piece.PieceType getSquareValue(int[] location) {

        return this.board[location[0]][location[1]];
    }

    public BasePiece getSquarePiece(int[] location) {
        return findByLocation(getSquareValue(location), location);
    }

    public String getSquareMarker(Piece.PieceType type, int[] location) {
        BasePiece piece = findByLocation(type, location);
        if(piece == null) {
            return "  ";
        }

        return piece.getMarker();
    }

    public boolean makeMove(int[] from, int[] to) {

        //get the actual piece
        BasePiece piece = getSquarePiece(from);

        if(piece == null) {
            return false;
        }

        //if not a knight, make sure the way is clear
        if(piece.getPieceType() != Piece.PieceType.KNIGHT) {
            if(isPathBlocked(from, to)) {
                System.out.println("piece in the way!");
                return false;
            } else {
                System.out.println("It's all clear!");
            }
        }

        BasePiece target = getSquarePiece(to);

        if(target == null) { //it's open, just move it
            piece.doMove(to);

            board[from[0]][from[1]] = Piece.PieceType.NONE;
            board[to[0]][to[1]] = piece.getPieceType();
            return true;
        }
        
        if(piece.pieceColor == target.pieceColor){
            return false;
        }
        
        if(piece.pieceType == Piece.PieceType.PAWN){
            if(piece.canTakePiece(to)){
                removeByLocation(to);
                piece.doMove(to);

                board[from[0]][from[1]] = Piece.PieceType.NONE;
                board[to[0]][to[1]] = piece.getPieceType();
                return true;
            }
            return false;
        }
        
        if(target.pieceType == Piece.PieceType.KING){
            return false;
        }
        
        removeByLocation(to);
        piece.doMove(to);
        
        board[from[0]][from[1]] = Piece.PieceType.NONE;
        board[to[0]][to[1]] = piece.getPieceType();
        
        return true;
    }

    public boolean isPathBlocked(int[] here, int[] there) {

        if(here[0] == there[0] || here[1] == there[1]) {
            if(here[0] != there[0]) {
                System.out.println("We're moving up/down");
                if(here[0] < there[0]) { //forward (as it relates to the board, not the color)
                    System.out.println("forward");
                    for(int i = here[0]+1; i < there[0]; i++) { //check up to one space short
                        System.out.println(this.getSquareValue(new int[]{i, here[1]}));
                        if(this.getSquareValue(new int[]{i, here[1]}) != Piece.PieceType.NONE) {
                            return true;
                        }
                    }
                } else { //backward
                    System.out.println("backward");
                    for(int i = here[0]-1; i > there[0]; i--) {
                        System.out.println(this.getSquareValue(new int[]{i, here[1]}));
                        if(this.getSquareValue(new int[]{i, here[1]}) != Piece.PieceType.NONE) {
                            return true;
                        }
                    }
                }
            }

            if(here[1] != there[1]) {
                System.out.println("We're moving left/right");
                if(here[1] > there[1]) { //left (as it relates to the board, not the color)
                    System.out.println("left");
                    for(int i = here[1]-1; i > there[1]; i--) {
                        System.out.println(this.getSquareValue(new int[]{here[0], i}));
                        if(this.getSquareValue(new int[]{here[0], i}) != Piece.PieceType.NONE) {
                            return true;
                        }
                    }
                } else { //right
                    System.out.println("right");
                    for(int i = here[1]+1; i < there[1]; i++) {
                        System.out.println(this.getSquareValue(new int[]{here[0], i}));
                        if(this.getSquareValue(new int[]{here[0], i}) != Piece.PieceType.NONE) {
                            return true;
                        }
                    }
                }
            }

        } else {
            System.out.println("We're moving diagonally");
            //figure out which way we are going
            if(here[0] < there[0] && here[1] < there[1]) {
                System.out.println("Forward and right");
                int i = here[0];
                int x = here[1];
                //System.out.println("here row: " + i);
                //System.out.println("here col: " + x);
                while(i != there[0]) {
                    if(this.getSquareValue(new int[]{i++, x++}) != Piece.PieceType.NONE) {
                        return true;
                    }
                }
            } else if (here[0] < there[0] && here[1] > there[1]) {
                System.out.println("Forward and left");
                int i = here[0];
                int x = here[1];
                while(i != there[0]) {
                    if(this.getSquareValue(new int[]{i++, x--}) != Piece.PieceType.NONE) {
                        return true;
                    }
                }

            } else if (here[0] > there[0] && here[1] < there[1]) {
                System.out.println("Backward and right");
                int i = here[0];
                int x = here[1];
                while(i != there[0]) {
                    if(this.getSquareValue(new int[]{i--, x++}) != Piece.PieceType.NONE) {
                        return true;
                    }
                }

            } else if (here[0] > there[0] && here[1] > there[1]) {
                System.out.println("Backward and left");
                int i = here[0];
                int x = here[1];
                while(i != there[0]) {
                    if(this.getSquareValue(new int[]{i--, x--}) != Piece.PieceType.NONE) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean isDiagonal(int[] here, int[] there) {
        return true;
    }

    private BasePiece findByLocation(Piece.PieceType type, int[] location) {
        for(int i=0; i < this.pieceCount; i++) {
            if(this.pieces[i] == null){
                continue;
            }
            
            BasePiece thisPiece = this.pieces[i];
            if(thisPiece.pieceType != type) {
                continue;  //move on to the next piece
            }

            if(thisPiece.location[0] == location[0] && thisPiece.location[1] == location[1]) { //see if the coordinates match
                return thisPiece;
            }
        }
        return null;
    }
    
    private void removeByLocation(int[] location){
        for(int i=0; i < this.pieceCount; i++) {
            if(this.pieces[i] == null){
                continue;
            }
            
            BasePiece thisPiece = this.pieces[i];
            
            if(thisPiece.location[0] == location[0] && thisPiece.location[1] == location[1]) { //see if the coordinates match
                this.pieces[i] = null;
            }
        }
    }
}
