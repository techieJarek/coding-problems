import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParentheses {

    public static void main(String[] args){
        String s1 = "{{({})}}";
        String s2 = "{([)]}";
        System.out.println("String s1 is valid = " + isValid(s1));
        System.out.println("String s2 is valid = " + isValid(s2));
    }

    private static boolean isValid(String s) {
        Stack<Character> openingCharsStack = new StringStack();
        Map<Character, Character> matchingParentheses = new HashMap();
        matchingParentheses.put('{', '}');
        matchingParentheses.put('(', ')');
        matchingParentheses.put('[', ']');
        for(char c : s.toCharArray()){
            if(matchingParentheses.containsKey(c)) {
                openingCharsStack.push(c);
            }
            else if((openingCharsStack.isEmpty() && matchingParentheses.containsValue(c))
                    || (!openingCharsStack.isEmpty() && matchingParentheses.get(openingCharsStack.pop()) != c)) {
                return false;
            }
        }
        return true;
    }
}
