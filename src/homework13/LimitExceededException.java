package homework13;

public class LimitExceededException extends Exception{
    private int limit;

    LimitExceededException(String message, int limit) {
        super(message);
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }
}
