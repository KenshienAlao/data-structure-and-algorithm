package LinkedList.Problem;

import java.util.LinkedList;

public class Problem3 {
    public static void main(String[] args) {
        LinkedList<Character> l = new LinkedList<>();

        l.add('a');
        l.add('b');
        l.add('c');
        l.add('d');
        l.add('e');
        l.add('f');


        for (int i = l.size()-1; i >= 0; i--) {
            if (i % 2 != 0){
                l.remove(i);
            }
        }

        System.out.println(l);
    }
}
