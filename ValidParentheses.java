import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([)]")); // false
        System.out.println(solution.isValid("{[]}")); // true
        System.out.println(solution.isValid(")(")); // false
        System.out.println(solution.isValid("]")); // false
        System.out.println(solution.isValid("")); // true
        System.out.println(solution.isValid("abc")); // false
        System.out.println(solution.isValid("abc(")); // false
        System.out.println(solution.isValid("abc)")); // false
        System.out.println(solution.isValid("[abc]")); // false
    }

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>();

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketLookup.containsKey(c)) {
                if (!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                }
            } else {
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }
}
