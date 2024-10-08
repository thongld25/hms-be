package introse.group20.hms.core.exceptions;

public class NotFoundException extends Exception {
    public int statusCode = 404;
    public NotFoundException(String message)
    {
        super(message);
    }
}
