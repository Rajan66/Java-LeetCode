package InterviewTest;

public class LengthOfLastElement {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim(); // remove trailing spaces from the end of the string
        String[] strArray = s.split(" ");
        String lastElement = strArray[strArray.length - 1];
//        return strArray[strArray.length - 1].length();
        return lastElement.length();
    }
}
