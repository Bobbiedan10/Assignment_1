//package Assignment_1;
//GamePiece parent class for Bramble, Zhen, Hunter
public class GamePiece {
    //Data type declaration
    String type;
    char symbol;
    int rowPos;
    int colPos;
    //Default constructor with initialisation
    GamePiece()
    {
        type = "?";
        symbol = '?';
        rowPos = 0;
        colPos = 0;
    }
    //type accessor and mutator
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //symbol accessor and mutator
    public void setSymbol(char symbol) { this.symbol = symbol; }

    public char getSymbol() { return symbol;}

    //colPos accessor and mutator
    public void setColPos(int colPos) {
        this.colPos = colPos;
    }

    public int getColPos() {
        return colPos;
    }

    //rowPos accessor and mutator
    public void setRowPos(int rowPos) {
        this.rowPos = rowPos;
    }

    public int getRowPos() {
        return rowPos;
    }
}
