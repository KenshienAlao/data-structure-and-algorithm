package Stack.Problems;

import java.util.Stack;

public class Problem3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<String> temp = new Stack<>();

        stack.push("iPhone");
        stack.push("Tablet");
        stack.push("Samsung");
        stack.push("Xiaomi");

        System.out.println("INITIAL");
        while (!stack.empty()) {
            String item = stack.pop();
            System.out.println(item);
            temp.push(item);
        }

        while (!temp.empty()) {
            stack.push(temp.pop());
        }

        System.out.println(stack);
    }
}
