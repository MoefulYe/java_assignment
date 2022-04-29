package secondHomework.recordKeeping.core;

public class illegalInputException extends Exception {
    private int input;
    public illegalInputException(int input) {
        this.input = input;
    }
    public int getInput() {
        return input;
    }
}
