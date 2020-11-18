package Assignment_1;

//Zhen game piece
public class Zhen extends GamePiece implements ControlActions{
    //Default constructor
    Zhen(){
        type = "zhen";
        symbol = 'Z';
    }

    @Override
    public int[] findNewPos(int direction) {
        int currX = getRowPos();
        int currY = getColPos();
        int[] expCoord = new int[2];

        //MOVE NORTH
        if(direction == 1){
            expCoord = new int[]{currX - 1, currY};
        }
        //MOVE SOUTH
        if(direction == 2){
            expCoord = new int[]{currX + 1, currY};
        }
        //MOVE WEST
        if(direction == 3){
            expCoord = new int[]{currX, currY - 1};
        }
        //MOVE EAST
        if(direction == 4){
            expCoord = new int[]{currX, currY + 1};
        }
        //MOVE NORTH-WEST
        if(direction == 5){
            expCoord = new int[]{currX - 1, currY - 1};
        }
        //MOVE NORTH-EAST
        if(direction == 6){
            expCoord = new int[]{currX - 1, currY + 1};
        }
        //MOVE SOUTH-WEST
        if(direction == 7){
            expCoord = new int[]{currX + 1, currY - 1};
        }
        //MOVE SOUTH-EAST
        if(direction == 8){
            expCoord = new int[]{currX + 1, currY + 1};
        }
        return expCoord;
    }

    @Override
    public void moveToNewPos(int direction) {
        setRowPos(findNewPos(direction)[0]);
        setColPos(findNewPos(direction)[1]);
    }
}
