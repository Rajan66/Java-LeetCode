import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKElements {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        int[] nums = {3, 0, 1, 0};

        int k = 1;
        int[] result = topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (Integer i : nums) {
            // we check the number and if it exists already we incresae the count
            // if the number is new we add it to the hashmap then increase the count  0+1
            if (!count.containsKey(i)) {
                count.put(i, 0);
            }
            count.put(i, count.get(i) + 1);
        }

        // if the value is greater than say max = 0 it becomes a new max.
        // if the value is not greater than max check with second max.
        // if the value is not greater than second max ignore and continue with the list
        int[] result = new int[k];

        int max = 0;
        int maxKey = 0;
        int secondMax = 0;
        int secondMaxKey = 0;
        for (Map.Entry<Integer, Integer> map : count.entrySet()) {
            if (map.getValue() > max) {
                if (map.getValue() > secondMax) {
                    secondMaxKey = maxKey;
                    secondMax = max;
                }
                maxKey = map.getKey();
                max = map.getValue();
            } else if (map.getValue() > secondMax) {
                secondMax = map.getValue();
                secondMaxKey = map.getKey();
            }
        }

        result[0] = maxKey;
        if (k > 1) {
            result[1] = secondMaxKey;
        }

//        for (Map.Entry<Integer, Integer> map : count.entrySet()) {
//            System.out.println(map.getKey() + " : " + map.getValue());
//        }

        return result;
    }
}
