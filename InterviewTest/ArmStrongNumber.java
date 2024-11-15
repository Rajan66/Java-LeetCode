package InterviewTest;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(findArmStrongNum(153));
        System.out.println(findArmStrongNum(253));
        System.out.println(findArmStrongNum(1));
        System.out.println(findArmStrongNum(53));
        System.out.println(findArmStrongNum(2883));
    }

    public static boolean findArmStrongNum(int n) {
        int temp = n;
        int result = 0;
        while (temp > 0) {
            int digit = temp % 10;
            result = (int) Math.pow(digit, 3) + result;
            temp = temp / 10;
        }
        return result == n;
    }
}
