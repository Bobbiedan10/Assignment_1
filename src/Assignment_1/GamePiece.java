package Assignment_1;

public class GamePiece {
    String type;
    char symbol;
    int rowPos;
    int colPos;

    GamePiece()
    {
        type = "?";
        symbol = '?';
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setColPos(int colPos) {
        this.colPos = colPos;
    }

    public int getColPos() {
        return colPos;
    }

    public void setRowPos(int rowPos) {
        this.rowPos = rowPos;
    }

    public int getRowPos() {
        return rowPos;
    }
}
