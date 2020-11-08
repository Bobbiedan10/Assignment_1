package Assignment_1;

public class Hunter extends GamePiece implements ControlActions{
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
        return new int[0];
    }

    @Override
    public boolean checkNewPos(int row, int col) {
        return false;
    }

    @Override
    public void moveToNewPos(int direction) {

    }
}
