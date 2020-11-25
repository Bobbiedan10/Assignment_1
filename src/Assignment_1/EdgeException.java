//GROUP 2
//Ramon Dalrymple - 417000248
//Chloe Hackett - 416000778
package Assignment_1;
//Edge of board exception (out of bounds)
public class EdgeException extends Exception{
    EdgeException()
    {
        super();
    }
    EdgeException(String message)
    {
        super(message);
    }


    public String toString()
    {
        return ("Edge Warning!");
    }
}
