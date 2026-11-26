package queues;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerLast(10);

        deque.offerLast(20);

        deque.offerFirst(5);

        System.out.println(deque);

        System.out.println(deque.peekFirst());

        System.out.println(deque);

        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst());

        System.out.println(deque);

        deque.offerFirst(30);

        System.out.println(deque);

        deque.offerLast(30);

        System.out.println(deque);

        System.out.println(deque.pollLast());

        System.out.println(deque);

        deque.push(40);

        System.out.println(deque);


    }
}
