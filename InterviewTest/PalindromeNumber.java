package InterviewTest;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1113));
        System.out.println(isPalindrome(111));

        System.out.println(isPalindromeString("Hello"));
        System.out.println(isPalindromeString("A man, a plan, a canal, Panama!"));
        System.out.println(isPalindromeString("No 'x' in Nixon"));
        System.out.println(isPalindromeString("Madam, in Eden, I'm Adam."));
        System.out.println(isPalindromeString("Was it a car or a cat I saw?"));
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

    public static boolean isPalindromeString(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(int n) {
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
