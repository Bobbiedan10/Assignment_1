package Assignment_1;

public class CrowdingException extends Exception{
    CrowdingException()
    {
        super();
    }

    public String toString()
    {
        return ("Stop Crowding!");
    }
}
