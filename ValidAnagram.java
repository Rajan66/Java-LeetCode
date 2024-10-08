import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat","rat"));
        System.out.println(isAnagram("car","rac"));
        System.out.println(isAnagram("cat","tac"));
        System.out.println(isAnagram("that","shat"));
    }


    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        System.out.println();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), 1 + countS.getOrDefault(s.charAt(i), 0));
            countT.put(t.charAt(i), 1 + countT.getOrDefault(t.charAt(i), 0));
        }

        for (Map.Entry<Character, Integer> map : countS.entrySet()) {
            if (map.getValue() != countT.get(map.getKey())) {
                return false;
            }
        }

        return true;
    }
}
