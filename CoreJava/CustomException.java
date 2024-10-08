package CoreJava;


public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable err) {
        super(message, err);
    }
}

class NumberPrinter {
    public static void main(String[] args) {
        int a = 5;

        try {
            int result = a + 1;
            int b = 5 / 0;
            if (result != 6) {
                throw new CustomException("Error error beep beep!!!!");
            }
            System.out.println("Result: " + result);
        } catch (CustomException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}