package introse.group20.hms.core.exceptions;

public class BadRequestException extends Exception{
    public int statusCode = 400;
    public BadRequestException(String message)
    {
        super(message);
    }
}
