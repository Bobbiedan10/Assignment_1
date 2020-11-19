//package Assignment_1;

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
