package InterviewTest;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1113));
        System.out.println(isPalindrome(111));
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int result = 0;

        while (temp > 0) {
            int digit = temp % 10;
            result = (result * 10) + digit;
            temp = temp / 10;
        }
        return n == result;
    }
}
