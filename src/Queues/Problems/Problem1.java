package Queues.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Spongebob");
        queue.offer("Patrick");
        queue.offer("Squidward");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
