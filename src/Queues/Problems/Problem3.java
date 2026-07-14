package Queues.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        int sum = 0;
        int count = 0;

        while (!queue.isEmpty()) {
            sum += queue.poll();
            count++;
        }

        double avg = (double) sum / count;

        System.out.println(avg);
    }
}
