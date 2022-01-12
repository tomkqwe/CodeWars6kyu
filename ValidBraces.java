package CodeWars;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

public class ValidBraces {
    public boolean isValid(String braces) {
        // Add code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            char current = braces.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) return false;
            }
            char peekChar = stack.peek();
            if ((current == ')' && peekChar != '(') || (current == ']' && peekChar != '[') || (current == '}' && peekChar != '{')) {
                return false;
            } else {
                stack.pop();
            }


        }
        return true;
    }

    public static void main(String[] args) {
        ValidBraces v = new ValidBraces();
        System.out.println(v.isValid("{()})"));
        System.out.println(v.isValid("[](())"));
    }
}
