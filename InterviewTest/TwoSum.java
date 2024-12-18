package InterviewTest;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(num, i);
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (count.containsKey(diff)) {
                return new int[]{count.get(diff), i};
            }
            count.put(num, i);
        }
        return new int[0];
    }
}
