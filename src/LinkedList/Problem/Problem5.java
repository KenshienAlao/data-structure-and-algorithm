package LinkedList.Problem;

import java.util.Collections;
import java.util.LinkedList;

public class Problem5 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> t = new LinkedList<>();

        l.add(5);
        l.add(1);
        l.add(3);

        l2.add(6);
        l2.add(2);
        l2.add(4);

        Collections.sort(l);
        Collections.sort(l2);

        while (!l.isEmpty() && !l2.isEmpty()){
            if (l.peek() <= l2.peek()){
                t.add(l.poll());
            } else {
                t.add(l2.poll());
            }
        }

        while (!l.isEmpty()){
            t.add(l.poll());
        }

        while (!l2.isEmpty()){
            t.add(l2.poll());
        }

        System.out.println(t);

    }
}
