package assistedPracticeProject2;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        try {
            processInput(0);
            processInput(7); 
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
    public static void processInput(int value) throws CustomException {
        if (value == 0) {
            throw new CustomException("Zero input is not allowed.");
        } else {
            System.out.println("Processing input: " + value);
        }
    }
}