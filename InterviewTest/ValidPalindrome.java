package InterviewTest;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            Character start = s.charAt(i);
            Character end = s.charAt(j);

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

    public boolean isPalindromeStr(String input) {
        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            char s = input.charAt(i);
            char t = input.charAt(j);

            if (!Character.isLetterOrDigit(s)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(t)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(s) != Character.toLowerCase(t)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


