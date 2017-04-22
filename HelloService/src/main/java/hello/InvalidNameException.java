package hello;

public class InvalidNameException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid name";
    }
}
