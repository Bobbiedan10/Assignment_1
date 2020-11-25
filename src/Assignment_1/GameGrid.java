//package Assignment_1;

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
            piece.setColPos(col);
            piece.setRowPos(row);
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
       
        int zhens = 0;

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
        //change CH
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++){
                if(grid[i][j] instanceof Hunter){
                    Hunter hunter = (Hunter) grid[i][j];
                    hunter.setPlayed(false);
                    System.out.println("Hunter "+ hunter.getSymbol() + " energy: " + hunter.getEnergyLevel());
                }
                else if(grid[i][j] instanceof Zhen){
                    zhens++;
                }
            }
        }
        numZhens = zhens;
        System.out.println("Number of Zhens: "+ zhens);
    }

   

    public void displayMovementOptions(int player){
        if(player == 1){
            System.out.println("Use the following numbers to move in the corresonding direction: 1 (north), 2 (south), 3 (east), 4 (west), 5 (north-west), 6 (north-east),7(south-west), 8(south-east), 9 (eat north), 10 (eat west), 11 (eat south), 12 (eat east):");
        }
        else if (player == 2 ){
            System.out.println("1 (north), 2 (south), 3 (east), 4 (west), 5 (north-west), 6 (north-east),7(south-west), 8(south-east).");
        }
        
    }

    boolean validateMove(int row, int col){
       try {
            if(row >= numRows || row <0|| col >= numCols || col <0)
            {
                throw new EdgeException("Re-enter or die!");
            }
            else if (grid[row][col] != null)
            {
                throw new CrowdingException();
            }

       }
       catch(Exception e){
            System.out.println(e);
            return false;
       }
        

        return true;
    }

    boolean isZhenPosition(int rowPos, int colPos){
        if(grid[rowPos][colPos] instanceof Zhen)
            return true;

        return false;
    }

    boolean removePiece(int rowPos, int colPos){
        if(isZhenPosition(rowPos, colPos))
        {
            grid[rowPos][colPos] = null;
            return true;
        }
        return false;
    }

    //Select Zehn
    //Select hunter
    void selectHunter(){
      
            while(true)// Repeat indefinetly until broken
            {
                try{
                    System.out.println("Player 1 please select a hunter to move!");
                    System.out.print("Row:");
                    int row = input.nextInt();
                    System.out.print("Column:");
                    int col = input.nextInt();
    
                    if(grid[row][col] instanceof Hunter)
                    {
                        Hunter hunter = (Hunter) grid[row][col];
                        if(!hunter.getPlayed()){
                            displayMovementOptions(1);
                        int direction = input.nextInt();
                        int[] newPos = hunter.findNewPos(direction);
                        if (validateMove(newPos[0], newPos[1])){
                            if(direction >= 9){
                                if(validateEating(hunter, direction))
                                {
                                    if(  hunter.getEnergyLevel()<hunter.getMaxEnergy()){
                                        eatZhen(hunter, direction);
                                        grid[row][col] = null;
                                        hunter.moveToNewPos(direction);
                                        hunter.setPlayed(true);
                                        hunter.setEnergyLevel(hunter.getEnergyLevel()+1);
                                        addGamePiece(hunter, hunter.getRowPos(), hunter.getColPos());
                                        return;// 
                                    }
                                    else throw new GluttonyException();
                                }
                                else{
                                    throw new Exception("No piece to eat try again");
                                }
                            }
                            else{
                                grid[row][col] = null;
                                hunter.moveToNewPos(direction);
                                if (hunter.getTimesNotEaten() >= 3)
                                {
                                    hunter.setTimesNotEaten( 0);
                                    hunter.setEnergyLevel(hunter.getEnergyLevel()-1);
                                }
                                hunter.setTimesNotEaten( hunter.getTimesNotEaten() +1);
                                addGamePiece(hunter, hunter.getRowPos(), hunter.getColPos());
                                hunter.setPlayed(true);
                                return;// breaks while loop
                            }
                          
                        }
                        else
                        System.out.println("Try Again");
                        }
                        else throw new Exception("Please select another hunter this one has played already for the round");
                    }
                    else System.out.println("Uhh ohh no Hunter at this position. Try again!");
    
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }

          
    }

    //Select Zehn
    void selectZehn(){
        int row;
        int col;
        while(true)// Repeat indefinetly until broken
        {
            try{
                System.out.println("Player 2 please select a zhen to move!");
                System.out.print("Row:");
                row = input.nextInt();
                System.out.print("Column:");
                col = input.nextInt();

                if(grid[row][col] instanceof Zhen)
                {
                    Zhen zhen = (Zhen) grid[row][col];
                    displayMovementOptions(2);
                    int direction = input.nextInt();
                    int[] newPos = zhen.findNewPos(direction);
                    if (validateMove(newPos[0], newPos[1])){
                        removePiece(row, col);
                        zhen.moveToNewPos(direction);
                        addGamePiece(zhen, zhen.getRowPos(), zhen.getColPos());
                        
                        return;// breaks while loop
                    }
                    else
                    System.out.println("Try Again");
                }
                else System.out.println("Uhh ohh no Zhen at this position. Try again!");

            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
    //Determines if the hunter can eat.
    boolean validateEating(Hunter hunter, int direction){
        
        if( direction == 9){
                if(grid[hunter.getRowPos()-1][hunter.getColPos()] instanceof Zhen)
                    return true;
                else return false;
        }
        else if( direction == 10){
            if(grid[hunter.getRowPos()][hunter.getColPos()- 1] instanceof Zhen)
                return true;
            else return false;
        }
        else if( direction == 11){
            if(grid[hunter.getRowPos()+1][hunter.getColPos()] instanceof Zhen)
                return true;
            else return false;
        }
        else if( direction == 12){
            if(grid[hunter.getRowPos()][hunter.getColPos()+1] instanceof Zhen)
                return true;
            else return false;
        }

        return false;
    }

    void eatZhen(Hunter hunter, int direction){
        
        if( direction == 9){
                if(grid[hunter.getRowPos()-1][hunter.getColPos()] instanceof Zhen)
                    removePiece(hunter.getRowPos()-1, hunter.getColPos());
            
        }
        else if( direction == 10){
            if(grid[hunter.getRowPos()][hunter.getColPos()- 1] instanceof Zhen)
                removePiece(hunter.getRowPos(), hunter.getColPos()-1);
        }
        else if( direction == 11){
            if(grid[hunter.getRowPos()+1][hunter.getColPos()] instanceof Zhen)
            removePiece(hunter.getRowPos()+1, hunter.getColPos());
        }
        else if( direction == 12){
            if(grid[hunter.getRowPos()][hunter.getColPos()+1] instanceof Zhen)
            removePiece(hunter.getRowPos(), hunter.getColPos()+1);
        }

        
    }

    boolean checkEnergyLevel(){
        int val =0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++){
               if( grid[i][j] instanceof Hunter )
                {
                    Hunter hunter = (Hunter) grid[i][j];
                    if(hunter.getEnergyLevel() <= 0)
                        val++;

                }
            }
        }
        if(val <=1)
            return false;
        else return true;
    }
    //Created to determine if the end of game conditions are met.
   int endGame(){
        if(numZhens <= 8)
            return 1;
        else if(checkEnergyLevel())
            return 2;
        return 0;
    }

}
