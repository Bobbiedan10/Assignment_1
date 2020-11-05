package Assignment_1;

public interface ControlActions {
    int[] findNewPos(int direction);
    boolean checkNewPos(int row, int col);
    void moveToNewPos(int direction);
}
