//package Assignment_1;

public class CrowdingException extends Exception{
    CrowdingException()
    {
        super();
    }
    CrowdingException(String message)
    {
        super(message);
    }

    public String toString()
    {
        return ("Stop Crowding!");
    }
}
