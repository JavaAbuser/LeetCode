package EasyTask5;
import java.util.Stack;

/**
 * @author Max Steblevskiy(JavaAbuser) on 03.01.22
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) return false;
                if(s.charAt(i) == ')' && stack.peek() != '(') return false;
                if(s.charAt(i) == ']' && stack.peek() != '[') return false;
                if(s.charAt(i) == '}' && stack.peek() != '{') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
