package introse.group20.hms.core.exceptions;

public abstract class BaseException  extends Exception{
    private int statusCode;
    private String message;
    public BaseException(String message)
    {
        super(message);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
