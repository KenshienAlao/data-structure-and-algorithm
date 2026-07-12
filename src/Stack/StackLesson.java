package Stack;

import java.util.Stack;

public class StackLesson {
    public static void main(String[] args) {
        // Stack = A data structure that follows LIFO (Last In, First Out).
        // The last item added is the first item removed.
        
        // isEmpty() = Checks if the stack has no items
        // push() = Adds an item to the top of the stack
        // pop() = Returns and removes the top item (LIFO: Last In, First Out)
        // peek() = Returns the top item without removing it
        // search() = Finds an item and returns its position from the top

        Stack<String> stack = new Stack<String>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println(stack.isEmpty() ? "Is empty" : "Not empty");

        System.out.println(stack.pop()); // will remove and returns the latest item

        String latest = stack.peek(); // gets the top item but will not remove it
        System.out.println(latest);

        System.out.println(stack.search("Apple")); // return value of 2 cause the orange is been remove cause of pop

        System.out.println(stack.search("Orange") == -1 ? "Orange doesnt exist" : "Orange exist"); // return value of -1
                                                                                                   // cause the orange
                                                                                                   // is not exist
                                                                                                   // anymore

        System.out.println(stack);
    }
}