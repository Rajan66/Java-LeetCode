package InterviewTest;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        HashMap<Character, Character> bracketsLookUp = new HashMap<>();

        bracketsLookUp.put('}', '{');
        bracketsLookUp.put(')', '(');
        bracketsLookUp.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (bracketsLookUp.containsKey(c)) {
                if (!brackets.empty() && bracketsLookUp.get(c).equals(brackets.peek())) {
                    brackets.pop();
                }
            } else {
                brackets.push(c);
            }
        }

        if (brackets.empty()) {
            return true;
        }

        return false;
    }
}
