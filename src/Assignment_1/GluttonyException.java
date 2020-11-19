//package Assignment_1;

public class GluttonyException extends Exception{
    GluttonyException()
    {
        super();
    }
    GluttonyException(String message)
    {
        super(message);
    }

    public String toString()
    {
        return ("Death by gluttony!");
    }
}
