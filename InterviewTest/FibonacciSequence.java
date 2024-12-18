package InterviewTest;

public class FibonacciSequence {
    public static void main(String[] args) {
        printFibonacciSequence2(5);
    }

    public static void printFibonacciSequence(int n) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }

    public static void printFibonacciSequence2(int n) {
        int num1 = 0;
        int num2 = 1;

        while (n > 0) {
            System.out.println(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            n--;
        }
    }
}
