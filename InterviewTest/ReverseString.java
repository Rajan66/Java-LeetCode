package InterviewTest;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Manny");
        reverseString("69abc123");

    }

    public static void reverseString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + result);
    }
}
