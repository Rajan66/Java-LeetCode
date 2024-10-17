import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int[] testcase1 = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        int[] testcase2 = {3, 0, 1, 0};
        int[] testcase3 = {1, 0, 1, 0, 2, 2};

        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(testcase1, k)));
        System.out.println(Arrays.toString(topKFrequent(testcase2, 1)));
        System.out.println(Arrays.toString(topKFrequent(testcase3, 2)));

        System.out.println(Arrays.toString(topKFrequentBucketSort(testcase1, k)));
        System.out.println(Arrays.toString(topKFrequentBucketSort(testcase2, 1)));
        System.out.println(Arrays.toString(topKFrequentBucketSort(testcase3, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> map : count.entrySet()) {
            arr.add(new int[]{map.getValue(), map.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];
        }
        return result;
    }

    public static int[] topKFrequentBucketSort(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        // this will create an array of lists.
        // Array freq will hold multiple array lists inside it.

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int item : freq[i]) {
                result[index++] = item;
                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
