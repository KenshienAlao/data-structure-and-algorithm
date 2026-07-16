package LinkedList.Problem;

import java.util.LinkedList;

public class Problem4 {
    public static void main(String[] args) {
        LinkedList<Character> l = new LinkedList<>();
        LinkedList<Character> t = new LinkedList<>();

        l.add('A');
        l.add('A');
        l.add('B');
        l.add('C');
        l.add('D');
        l.add('E');

        char prev = l.poll();
        t.add(prev);

        while(!l.isEmpty()) {
            char curr = l.poll();
            if (prev != curr){
                t.add(curr);
            }
            prev = curr;
        }
        System.out.println(t);
    }
}
