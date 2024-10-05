public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println("---------------");
        System.out.println(palindromeStr("abba"));
        System.out.println(palindromeStr("A man, a plan, a canal: Panama"));
        System.out.println(palindromeStr("race a car"));
        System.out.println(palindromeStr(" "));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        String reverseStr = new StringBuilder(newStr).reverse().toString();
        return newStr.toString().equals(reverseStr);
    }

    public static boolean palindromeStr(String s) {
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
}
