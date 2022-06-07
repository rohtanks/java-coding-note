package codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        if (S.isEmpty())
            return 1;

        Stack<Integer> stack = new Stack();

        for (char s : S.toCharArray()) {
            System.out.println(stack.toString());
            switch (s) {
                case '(':
                    stack.push(1);
                    break;
                case '{':
                    stack.push(2);
                    break;
                case '[':
                    stack.push(3);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != 1)
                        return 0;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != 2)
                        return 0;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != 3)
                        return 0;
                    break;
            }
        }

        return 1;
    }
}
