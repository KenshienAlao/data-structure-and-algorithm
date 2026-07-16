package LinkedList;

import java.util.LinkedList;

public class LinkedListLesson {
    public static void main(String[] args) {

        // LinkedList = Stores elements in nodes connected together.
        // Can be used as a List, Queue, or Stack.

        // List Methods
        // add(e) = Adds an element to the end
        // addFirst(e) = Adds an element to the beginning
        // addLast(e) = Adds an element to the end

        // Queue Methods (FIFO)
        // offer(e) = Adds an element to the tail
        // poll() = Removes and returns the head
        // peek() = Returns the head without removing it

        // Stack Methods (LIFO)
        // push(e) = Adds an element to the top
        // pop() = Removes and returns the top
        // peek() = Returns the top without removing it

        LinkedList<String> list = new LinkedList<>();

        // List
        list.add("Spongebob");
        list.add("Patrick");
        list.add("Squidward");

        System.out.println("List: " + list);

        // Queue
        list.offer("Sandy");

        System.out.println("After offer(): " + list);
        System.out.println("peek(): " + list.peek());

        list.poll();

        System.out.println("After poll(): " + list);

        // Stack
        list.push("Mr. Krabs");

        System.out.println("After push(): " + list);
        System.out.println("pop(): " + list.pop());

        System.out.println("Final List: " + list);

        // Additionally
        list.add(2, "Larry");

        System.out.println("After add() w/ index: " + list);
    }
}