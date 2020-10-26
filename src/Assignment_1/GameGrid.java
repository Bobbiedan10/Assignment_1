package Assignment_1;

import java.util.Scanner;

public class GameGrid {
    Scanner input = new Scanner(System.in);
    int numRows;
    int numCols;
    GamePiece[][] grid;
    Player player1, player2;
    int numZhens;
    int[] hunter1Coord;
    int[] hunter2Coord;
    int numHunters;

    GameGrid(){
        numRows = 8;
        numCols = 8;
        grid = new GamePiece[numRows][numCols];
    }

    public boolean addGamePiece(GamePiece piece, int row, int col){
        piece = new GamePiece();
        return true;
    }

    void setupGrid(){
        String Player1 = "";
        String Player2 = "";
        player1 = new Player(Player1);
        player2 = new Player(Player2);


        System.out.println("Player 1, enter your name: ");
        Player1 = input.nextLine();
        player1.setName(Player1);
        System.out.println("Player 2, enter your name: ");
        Player2 = input.next();
        player2.setName(Player2);

        System.out.println();
        System.out.println("How many Zhens do you wish to play with: 16 or 18 or 20");
        numZhens = input.nextInt();

        Zhen zhen = new Zhen();
        Hunter hunter = new Hunter();
        Bramble bramble = new Bramble();

        addGamePiece(bramble, 0, 0);
        addGamePiece(bramble, 0, 1);
        addGamePiece(bramble, 0, 6);
        addGamePiece(bramble, 0, 7);
        addGamePiece(bramble, 1, 0);
        addGamePiece(bramble, 1, 1);
        addGamePiece(bramble, 1, 6);
        addGamePiece(bramble, 1, 7);
        addGamePiece(bramble, 6, 0);
        addGamePiece(bramble, 6, 1);
        addGamePiece(bramble, 6, 6);
        addGamePiece(bramble, 6, 7);
        addGamePiece(bramble, 7, 0);
        addGamePiece(bramble, 7, 1);
        addGamePiece(bramble, 7, 6);
        addGamePiece(bramble, 7, 7);

        System.out.println(player1.getName()+ " " + player2.getName()+ " " + numZhens + " " + bramble.symbol);
    }

    void displayGrid() {
        System.out.println(" ... ... ... ... ... ... ... ... ");
        for (int i = 0; i < numRows; i++) {
            System.out.print("| ");
            for (int j = 0; j < numCols; j++){
                System.out.print("  | ");
            }
            System.out.println();
            System.out.println(" ... ... ... ... ... ... ... ... ");
        }
    }
}
