package Assignment_1;

public class Hunter extends GamePiece implements ControlActions{
    int energyLevel;
    final int MAXENERGY = 6;
    char hName;

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
