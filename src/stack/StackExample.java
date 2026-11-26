package stack;

import java.util.Stack;
import java.util.jar.JarOutputStream;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);

        stack.push(2);

        stack.push(7);

        stack.push(8);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.push(11);
        System.out.println(stack);

        System.out.println(stack.search(11));
        System.out.println(stack.search(5));

        System.out.println(stack.search(2));

    }
}
