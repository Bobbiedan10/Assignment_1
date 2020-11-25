//GROUP 2
//Ramon Dalrymple - 417000248
//Chloe Hackett - 416000778
package Assignment_1;

//Gluttony exception (over eating)
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
