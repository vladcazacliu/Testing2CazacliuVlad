package lab20;

public class InvalidSubscriptException extends RuntimeException{
    public InvalidSubscriptException() {
        this("Subscript Exception");
    }

    public InvalidSubscriptException(String message) {
        super(message);
    }
}
