package Assignment_1;

public class Hunter extends GamePiece implements ControlActions, EatingActions{
    int energyLevel;
    final int MAXENERGY = 6;
    char hName;
    int timesNotEaten;

    Hunter(){
        type = "hunter";
        symbol = 'H';
        energyLevel = 0;
    }

    public void setEnergyLevel(int energyLevel) {
        if(energyLevel > MAXENERGY){
            energyLevel = MAXENERGY;
        }
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void sethName(char hName) {
        this.hName = hName;
    }

    public char gethName() {
        return hName;
    }

    public void setTimesNotEaten(int timesNotEaten) { this.timesNotEaten = timesNotEaten; }

    public int getTimesNotEaten() { return timesNotEaten; }

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
        //EAT NORTH
        if(direction == 9){
            expCoord = new int[]{currX - 2, currY};
        }
        //EAT WEST
        if(direction == 10){
            expCoord = new int[]{currX, currY - 2};
        }
        //EAT SOUTH
        if(direction == 11){
            expCoord = new int[]{currX + 2, currY};
        }
        //EAT EAST
        if(direction == 12){
            expCoord = new int[]{currX, currY + 2};
        }
        return expCoord;
    }

    @Override
    public void moveToNewPos(int direction) {
        setRowPos(findNewPos(direction)[0]);
        setColPos(findNewPos(direction)[1]);
    }

    @Override
    public void eatWest() {
        setColPos(findNewPos(10)[1]);
    }

    @Override
    public void eatEast() {
        setColPos(findNewPos(12)[1]);
    }

    @Override
    public void eatNorth() {
        setRowPos(findNewPos(9)[0]);
    }

    @Override
    public void eatSouth() {
        setRowPos(findNewPos(11)[0]);
    }
}
