package LinkedList.Problem;

import java.util.LinkedList;

public class Problem1 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        l.add("SpongeBob");
        l.add("Patrick");
        l.add("Squidward");

        String q = "patrick";
        boolean isFound = false;

        while(!l.isEmpty()){
            String temp = l.poll();
            if (temp.toLowerCase().contains(q.toLowerCase())) {
                isFound = true;
                break;
            }
        }

        System.out.println(isFound ? "Found" : "Not found");

    }
}
