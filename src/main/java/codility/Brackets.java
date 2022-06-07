package codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        if (S.isEmpty())
            return 1;

        Stack<Character> stack = new Stack();

        for (char c : S.toCharArray()) {
            System.out.println(stack.toString());
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else {
                if (stack.isEmpty() || c != stack.pop()) {
                    return 0;
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
