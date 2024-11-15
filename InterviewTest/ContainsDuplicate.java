package InterviewTest;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,4,4}));
        System.out.println(containsDuplicate(new int[]{1,2,1,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (uniques.contains(num)) {
                return true;
            } else {
                uniques.add(num);
            }
        }
        return false;
    }
}
