/**
 * 
 */
package com.sree.commons.sreecommons;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author skallem
 *
 */
public class ParanthesisCheck {

    private static final Map<Character, Character> characterMap = new HashMap<Character, Character>();
    static {
        characterMap.put('(', ')');
        characterMap.put('{', '}');
        characterMap.put('[', ']');
    }

    /**
     * To check if parenthesis are balanced.
     * 
     * @param str
     * @return
     * @throws Exception
     */
    public static boolean isValid(String str) throws Exception {
        if (str.length() == 0) { // Blank is ignored for now.
            return true;
        }
        // Length should always be even.
        if ((str.length() % 2) != 0) {
            return false;
        }

        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (characterMap.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty()
                    || (str.charAt(i) != characterMap.get(stack.pop()))) {
                return false;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("String check isValid: " + "[[" + " "
                + isValid("[["));
        System.out.println("String check isValid: " + "{}([])" + " "
                + isValid("{}([])"));
        System.out.println("String check isValid: " + "([}])" + " "
                + isValid("([}])"));
        System.out.println("String check isValid: " + "([])" + " "
                + isValid("([])"));
        System.out.println("String check isValid: " + "()[]{}[][]" + " "
                + isValid("()[]{}[][]"));
    }
}
