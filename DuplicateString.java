import java.util.HashMap;
import java.util.Map;

public class DuplicateString {
    public static void main(String[] args) {
        String dummyText = "abaacbbbd";
        firstNonDuplicate(dummyText);
    }

    public static void firstNonDuplicate(String data) {
        char[] charArray = data.toCharArray();

        Map<Character, Integer> countMap = new HashMap<>();

        for (char character : charArray) {
            if (countMap.containsKey(character)) {
                countMap.put(character, countMap.get(character) + 1);
            } else {
                countMap.put(character, 1);
            }
//            countMap.put(character, countMap.getOrDefault(character, 0) + 1);
        }

        // HashMap doesnt maintain order of the entries so might not give first duplicate everytime
//        for (Map.Entry<Character, Integer> mp : countMap.entrySet()) {
//            if (mp.getValue() == 1) {
//                System.out.println(mp.getKey() + " is the first non duplicate");
//                return;
//            }
//        }

        for (char character : charArray) {
            if (countMap.get(character) == 1) {
                System.out.println(character + " is the first non duplicate");
                return;
            }
        }
        System.out.println("There is no non duplicate value in the list.");
    }
}
