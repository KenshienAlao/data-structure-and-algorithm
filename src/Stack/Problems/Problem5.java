package Stack.Problems;

import java.util.Stack;

public class Problem5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Google");
        stack.push("YouTube");
        stack.push("GitHub");
        stack.push("Facebook");

        System.out.println("Current Page: " + stack.peek());

        if (stack.size() > 1) {
            stack.pop();
            System.out.println("\nBack -> " + stack.peek());
        }

        if (stack.size() > 1) {
            stack.pop();
            System.out.println("Back -> " + stack.peek());
        }

        System.out.println("\nCurrent Page: " + stack.peek());
    }
}
