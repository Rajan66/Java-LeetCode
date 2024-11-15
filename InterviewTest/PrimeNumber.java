package InterviewTest;


import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNPrime(5)));
    }

    public static int[] getNPrime(int n) {
        int[] result = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                result[count] = num;
                count++;
            }
            num++;
        }
        return result;
    }
}