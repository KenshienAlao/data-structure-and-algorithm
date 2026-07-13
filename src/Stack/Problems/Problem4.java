package Stack.Problems;
import java.util.Stack;

public class Problem4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        stack.push(10);
        stack.push(5);
        stack.push(50);
        stack.push(3);
        stack.push(13);
        int Largest = stack.peek();

        while(!stack.isEmpty()){
            int num = stack.pop();

            if (num > Largest){
                Largest = num;
            }

            temp.push(num);
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

        System.out.println("Largest: " + Largest);
        System.out.println("Stack: " + stack);
    }
}