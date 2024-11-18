import java.util.*;


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                return true;
            }
            count.put(num, 1);
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countS.entrySet()) {
            if (!entry.getValue().equals(countT.getOrDefault(entry.getKey(), 0))) {
                return false;
            }
        }
        return true;
    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (leftDepth > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }
//        or
//        return Math.max(leftDepth, rightDepth) + 1;
    }

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

    /*public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        int[] res = new int[2];
        for (int num : nums) {
            if (store.containsKey(target - num)) {
                res[0] = store.get(target - num);
                res[1] = num;
                return res;
            }
        }
    }*/
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (!result.containsKey(sortedWord)) {
                result.put(sortedWord, new ArrayList<>());
            }
            result.get(sortedWord).add(str);
        }
        return new ArrayList<>(result.values());
    }


    public List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);

            if (!result.containsKey(sortedWord)) {
                result.put(sortedWord, new ArrayList<>());
            }
            result.get(sortedWord).add(str);
        }
        return new ArrayList<>(result.values());
    }


}

