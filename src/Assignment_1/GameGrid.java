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
        if(grid[row][col] == null){
            grid[row][col] = piece;
            piece.setRowPos(row);
            piece.setColPos(col);
            return true;
        }
        else {
            return false;
        }
    }

    void setupGrid(){
        Zhen zhen = new Zhen();
        Hunter hunter = new Hunter();
        Bramble bramble = new Bramble();

        String Player1 = "";
        String Player2 = "";
        player1 = new Player(Player1);
        player2 = new Player(Player2);
        hunter1Coord = new int[2];
        hunter2Coord = new int[2];

        int rowPos = hunter.getRowPos();
        int colPos = hunter.getColPos();

        System.out.println("Player 1, enter your name: ");
        Player1 = input.nextLine();
        player1.setName(Player1);
        System.out.println("Player 2, enter your name: ");
        Player2 = input.next();
        player2.setName(Player2);

        System.out.println();
        System.out.println("How many Zhens do you wish to play with: 16 or 18 or 20");
        numZhens = input.nextInt();
        while(numZhens != 16 && numZhens != 18 && numZhens != 20){
            System.out.println("Please select a number specified above");
            numZhens = input.nextInt();
        }




        if(numZhens == 16) {
            addGamePiece(bramble, 0, 0);
            addGamePiece(bramble, 0, 1);
            addGamePiece(zhen, 0, 2);
            addGamePiece(zhen, 0, 3);
            addGamePiece(zhen, 0, 4);
            addGamePiece(zhen, 0, 5);
            addGamePiece(bramble, 0, 6);
            addGamePiece(bramble, 0, 7);
            addGamePiece(bramble, 1, 0);
            addGamePiece(bramble, 1, 1);
            addGamePiece(zhen, 1, 2);
            addGamePiece(zhen, 1, 3);
            addGamePiece(zhen, 1, 4);
            addGamePiece(zhen, 1, 5);
            addGamePiece(bramble, 1, 6);
            addGamePiece(bramble, 1, 7);
            addGamePiece(zhen, 2, 0);
            addGamePiece(zhen, 2, 1);
            addGamePiece(zhen, 2, 2);
            addGamePiece(zhen, 2, 3);
            addGamePiece(zhen, 2, 4);
            addGamePiece(zhen, 2, 5);
            addGamePiece(zhen, 2, 6);
            addGamePiece(zhen, 2, 7);
            addGamePiece(hunter, 4, 3);
            addGamePiece(hunter, 4, 4);
            addGamePiece(bramble, 6, 0);
            addGamePiece(bramble, 6, 1);
            addGamePiece(bramble, 6, 6);
            addGamePiece(bramble, 6, 7);
            addGamePiece(bramble, 7, 0);
            addGamePiece(bramble, 7, 1);
            addGamePiece(bramble, 7, 6);
            addGamePiece(bramble, 7, 7);
        }

        else if(numZhens == 18) {
            addGamePiece(bramble, 0, 0);
            addGamePiece(bramble, 0, 1);
            addGamePiece(zhen, 0, 2);
            addGamePiece(zhen, 0, 3);
            addGamePiece(zhen, 0, 4);
            addGamePiece(zhen, 0, 5);
            addGamePiece(bramble, 0, 6);
            addGamePiece(bramble, 0, 7);
            addGamePiece(bramble, 1, 0);
            addGamePiece(bramble, 1, 1);
            addGamePiece(zhen, 1, 2);
            addGamePiece(zhen, 1, 3);
            addGamePiece(zhen, 1, 4);
            addGamePiece(zhen, 1, 5);
            addGamePiece(bramble, 1, 6);
            addGamePiece(bramble, 1, 7);
            addGamePiece(zhen, 2, 0);
            addGamePiece(zhen, 2, 1);
            addGamePiece(zhen, 2, 2);
            addGamePiece(zhen, 2, 3);
            addGamePiece(zhen, 2, 4);
            addGamePiece(zhen, 2, 5);
            addGamePiece(zhen, 2, 6);
            addGamePiece(zhen, 2, 7);
            addGamePiece(zhen, 3, 0);
            addGamePiece(zhen, 3, 7);
            addGamePiece(hunter, 4, 3);
            addGamePiece(hunter, 4, 4);
            addGamePiece(bramble, 6, 0);
            addGamePiece(bramble, 6, 1);
            addGamePiece(bramble, 6, 6);
            addGamePiece(bramble, 6, 7);
            addGamePiece(bramble, 7, 0);
            addGamePiece(bramble, 7, 1);
            addGamePiece(bramble, 7, 6);
            addGamePiece(bramble, 7, 7);
        }

        if(numZhens == 20) {
            addGamePiece(bramble, 0, 0);
            addGamePiece(bramble, 0, 1);
            addGamePiece(zhen, 0, 2);
            addGamePiece(zhen, 0, 3);
            addGamePiece(zhen, 0, 4);
            addGamePiece(zhen, 0, 5);
            addGamePiece(bramble, 0, 6);
            addGamePiece(bramble, 0, 7);
            addGamePiece(bramble, 1, 0);
            addGamePiece(bramble, 1, 1);
            addGamePiece(zhen, 1, 2);
            addGamePiece(zhen, 1, 3);
            addGamePiece(zhen, 1, 4);
            addGamePiece(zhen, 1, 5);
            addGamePiece(bramble, 1, 6);
            addGamePiece(bramble, 1, 7);
            addGamePiece(zhen, 2, 0);
            addGamePiece(zhen, 2, 1);
            addGamePiece(zhen, 2, 2);
            addGamePiece(zhen, 2, 3);
            addGamePiece(zhen, 2, 4);
            addGamePiece(zhen, 2, 5);
            addGamePiece(zhen, 2, 6);
            addGamePiece(zhen, 2, 7);
            addGamePiece(zhen, 3, 0);
            addGamePiece(zhen, 3, 7);
            addGamePiece(zhen, 4, 0);
            addGamePiece(zhen, 4, 7);
            addGamePiece(hunter, 4, 3);
            addGamePiece(hunter, 4, 4);
            addGamePiece(bramble, 6, 0);
            addGamePiece(bramble, 6, 1);
            addGamePiece(bramble, 6, 6);
            addGamePiece(bramble, 6, 7);
            addGamePiece(bramble, 7, 0);
            addGamePiece(bramble, 7, 1);
            addGamePiece(bramble, 7, 6);
            addGamePiece(bramble, 7, 7);
        }
    }

    void displayGrid() {
        Hunter hunter = new Hunter();
        Zhen zhens = new Zhen();

        System.out.println(" ... ... ... ... ... ... ... ... ");
        for (int i = 0; i < numRows; i++) {
            System.out.print("| ");
            for (int j = 0; j < numCols; j++){
                if(grid[i][j] == null){
                    System.out.print("  | ");
                }
                else {
                    System.out.print(grid[i][j].symbol + " | ");
                }
            }
            System.out.println();
            System.out.println(" ... ... ... ... ... ... ... ... ");


        }
        System.out.println();
        System.out.println("Hunter "+ hunter.hName + " energy: " + hunter.getMAXENERGY());
        System.out.println("Hunter "+ hunter.hName + " energy: " + hunter.getMAXENERGY());
        System.out.println("Number of Zhens: "+ numZhens);
    }
}
