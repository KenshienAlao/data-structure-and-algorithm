package Stack.Problems;

import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String text = "Hello";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            stack.push(c);
        }

        for (int i = 0; i < text.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
