package Assignment_1;

//Allow user to enter data using Scanner
import java.util.Scanner;

//GameGrid definition
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

    //Initialise game grid
    GameGrid(){
        numRows = 8;
        numCols = 8;
        grid = new GamePiece[numRows][numCols];
    }

    //Add functions to their respective location using addGamePiece
    public boolean addGamePiece(GamePiece piece, int row, int col){
        if(grid[row][col] == null){
            grid[row][col] = piece;
            return true;
        }
        else {
            return false;
        }
    }

    //Prepare all components to be displayed
    void setupGrid() {

        //
        hunter1Coord = new int[2];
        hunter2Coord = new int[2];

        String Player1 = "";
        String Player2 = "";

        //Initialise players
        player1 = new Player(Player1);
        player2 = new Player(Player2);

        //Notify players of game flow
        System.out.println("Player 1, enter your name: ");
        Player1 = input.nextLine();
        player1.setName(Player1);
        System.out.println("Player 1, You are the Hunter");
        System.out.println("Please enter two initials for Hunter 1 and Hunter 2");
        System.out.println("Hunter 1");
        char hunt1 = input.next().toUpperCase().charAt(0);
        while (hunt1 == 'Z'){
            System.out.println("Use a different initial for Hunter 1.");
            System.out.println("The letter Z is not permitted");
            hunt1 = input.next().toUpperCase().charAt(0);
        }
        System.out.println("Hunter 2");
        char hunt2 = input.next().toUpperCase().charAt(0);
        while (hunt2 == 'Z'){
            System.out.println("Use a different initial for Hunter 2.");
            System.out.println("The letter Z is not permitted");
            hunt2 = input.next().toUpperCase().charAt(0);
        }
        while(hunt2 == hunt1){
            System.out.println("Use a different initial for Hunter 2.");
            System.out.println("Hunter 1 and Hunter 2 must be different.");
            hunt2 = input.next().toUpperCase().charAt(0);
        }
        System.out.println("Player 2, enter your name: ");
        Player2 = input.next();
        player2.setName(Player2);

        System.out.println();
        System.out.println("You control the Zhens");
        System.out.println("How many Zhens do you wish to play with: 16 or 18 or 20");
        numZhens = input.nextInt();
        while (numZhens != 16 && numZhens != 18 && numZhens != 20) {
            System.out.println("Please select a number specified above");
            numZhens = input.nextInt();
        }

        //Add all pieces to the board
        addGamePiece(new Bramble(), 0, 0);
        addGamePiece(new Bramble(), 0, 1);
        addGamePiece(new Zhen(), 0, 2);
        addGamePiece(new Zhen(), 0, 3);
        addGamePiece(new Zhen(), 0, 4);
        addGamePiece(new Zhen(), 0, 5);
        addGamePiece(new Bramble(), 0, 6);
        addGamePiece(new Bramble(), 0, 7);
        addGamePiece(new Bramble(), 1, 0);
        addGamePiece(new Bramble(), 1, 1);
        addGamePiece(new Zhen(), 1, 2);
        addGamePiece(new Zhen(), 1, 3);
        addGamePiece(new Zhen(), 1, 4);
        addGamePiece(new Zhen(), 1, 5);
        addGamePiece(new Bramble(), 1, 6);
        addGamePiece(new Bramble(), 1, 7);
        addGamePiece(new Zhen(), 2, 0);
        addGamePiece(new Zhen(), 2, 1);
        addGamePiece(new Zhen(), 2, 2);
        addGamePiece(new Zhen(), 2, 3);
        addGamePiece(new Zhen(), 2, 4);
        addGamePiece(new Zhen(), 2, 5);
        addGamePiece(new Zhen(), 2, 6);
        addGamePiece(new Zhen(), 2, 7);
        addGamePiece(new Hunter(), 4, 3);
        grid[4][3].setSymbol(hunt1);

        //set hunter 1 location on grid
        hunter1Coord[0] = 4;
        hunter1Coord[1] = 3;
        addGamePiece(new Hunter(), 4, 4);
        grid[4][4].setSymbol(hunt2);

        //set hunter 2 location on grid
        hunter2Coord[0] = 4;
        hunter2Coord[1] = 4;
        addGamePiece(new Bramble(), 6, 0);
        addGamePiece(new Bramble(), 6, 1);
        addGamePiece(new Bramble(), 6, 6);
        addGamePiece(new Bramble(), 6, 7);
        addGamePiece(new Bramble(), 7, 0);
        addGamePiece(new Bramble(), 7, 1);
        addGamePiece(new Bramble(), 7, 6);
        addGamePiece(new Bramble(), 7, 7);

        //add extra pieces on users request
        if (numZhens == 18) {
            addGamePiece(new Zhen(), 3, 0);
            addGamePiece(new Zhen(), 3, 7);
        } else if (numZhens == 20) {
            addGamePiece(new Zhen(), 3, 0);
            addGamePiece(new Zhen(), 3, 7);
            addGamePiece(new Zhen(), 4, 0);
            addGamePiece(new Zhen(), 4, 7);
        }
    }

    //show the game grid to the user
    void displayGrid() {
        Hunter hunter = new Hunter();
        Zhen zhens = new Zhen();

        System.out.println(" ... ... ... ... ... ... ... ... ");
        for (int i = 0; i < numRows; i++) {
            System.out.print("| ");
            for (int j = 0; j < numCols; j++){
                //if a location is empty add nothing to it
                if(grid[i][j] == null){
                    System.out.print("  | ");
                }
                //else show all components
                else {
                    System.out.print(grid[i][j].getSymbol() + " | ");
                }
            }
            System.out.println();
            System.out.println(" ... ... ... ... ... ... ... ... ");


        }
        System.out.println();

        //give the players information about their characters.
        System.out.println("Hunter "+ grid[4][3].getSymbol() + " energy: " + hunter.getMAXENERGY());
        System.out.println("Hunter "+ grid[4][4].getSymbol() + " energy: " + hunter.getMAXENERGY());
        System.out.println("Number of Zhens: "+ numZhens);
    }
}
