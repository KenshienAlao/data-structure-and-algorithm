package LinkedList.Problem;

import java.util.LinkedList;

public class Problem2 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        l.removeIf(t -> t % 2 == 1);

        System.out.println(l);

    }
}
