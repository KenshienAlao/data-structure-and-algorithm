package Stack.Problems;

import java.util.Stack;

public class Problem2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String text = "(())";

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()){
                    System.out.println("Not balanced");
                    return;
                }
                stack.pop();
            }
        }
        System.out.println(stack.isEmpty() ? "Balanced" : "Not balanced");
    }
}
