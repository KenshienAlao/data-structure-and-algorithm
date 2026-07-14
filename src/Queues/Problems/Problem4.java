package Queues.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (i % 2 == 0){
                temp.offer(i);
            }
        }

        while (!temp.isEmpty()) {
            queue.offer(temp.poll());
        }

        System.out.println("EVEN: " + queue);
    }
}
