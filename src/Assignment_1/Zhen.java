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
