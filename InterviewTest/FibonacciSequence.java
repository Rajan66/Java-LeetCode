package InterviewTest;

public class FibonacciSequence {
    public static void main(String[] args) {
        printFibonacciSequence(5);
    }
    public static void printFibonacciSequence(int n) {
        int num1 = 0;
        int num2 = 1;

        for(int i=0;i<n;i++){
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }
}
