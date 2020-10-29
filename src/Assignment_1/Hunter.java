package Assignment_1;

public class Hunter extends GamePiece {
    int energyLevel;
    final int MAXENERGY = 4;
    char hName;

    Hunter(){
        type = "hunter";
        symbol = 'H';
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getMAXENERGY() {
        return MAXENERGY;
    }

    public void sethName(char hName) {
        this.hName = hName;
    }

    public char gethName() {
        return hName;
    }
}
