package Practice.Test6;

import java.util.ArrayDeque;

public class test2 {
    public static void main(String[] args) {
        String expr = "([{}])";
        boolean result = checkParanthesis(expr);
        System.out.println(result);


    }

    private static boolean checkParanthesis(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char temp;
            switch (ch) {
                case ')':
                    temp = stack.pop();
                    if (temp == '{' || temp == '[')
                        return false;
                    break;
                case '}':
                    temp = stack.pop();
                    if (temp == '(' || temp == '[')
                        return false;
                    break;
                case ']':
                    temp = stack.pop();
                    if (temp == '(' || temp == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
