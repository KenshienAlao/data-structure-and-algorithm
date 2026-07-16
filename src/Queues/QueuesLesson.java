package Queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesLesson {
    public static void main(String[] args) {
        // Queue = A data structure that follows FIFO (First In, First Out).
        // The first item added is the first item removed.

        // Head = The first item in the queue
        // Tail = The last item in the queue

        // offer(e) / add(e) = Adds an item to the tail
        // poll() / remove() = Removes and returns the head item
        // peek() / element() = Returns the head item without removing it

        // LinkedList = Keeps items in the order they were added
        LinkedListLesson();

        // PriorityQueue = Orders items by priority.
        // By default, the smallest value comes first.
        PriorityQueueLesson();
    }

    static void LinkedListLesson() {
        // LinkedList = Stores item in order the moment you add them
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Spongebob");
        queue.offer("Patrick");
        queue.offer("Squidward");
        queue.offer("Sandy");
        queue.offer("Mr.Crabs");

        queue.poll(); // will remove Spongebob because he is the first one that comes

        System.out.println(queue.peek()); // will return value of Patrick cause Patrick is now the head

        System.out.println(queue);
    }

    static void PriorityQueueLesson() {
        // for the highest to lowest add (Collections.reverseOrder)
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(40);
        queue.offer(60);
        queue.offer(80);
        queue.offer(10);


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
