package Queues.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(10);
        queue.offer(30);
        queue.offer(10);
        queue.offer(40);

        int search = 10;
        int count = 0;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            if (search == temp){
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
