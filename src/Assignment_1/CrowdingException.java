//GROUP 2
//Ramon Dalrymple - 417000248
//Chloe Hackett - 416000778
package Assignment_1;
//Players Crowding exception
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
