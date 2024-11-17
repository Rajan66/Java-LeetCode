import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] input1 = {""};
        String[] input2 = {"a"};

        System.out.println(groupAnagrams(input));
        System.out.println(groupAnagrams(input1));
        System.out.println(groupAnagrams(input2));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();


        for (String s : strs) {
            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        }

        return new ArrayList<>(result.values());
    }

    public List<List<String>> groupAnagramsUsingSort(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
