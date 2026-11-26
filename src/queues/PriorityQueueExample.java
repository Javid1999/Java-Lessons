package queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
public  static void simpleExample()
    {
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>();

        integerPriorityQueue.add(5);
        integerPriorityQueue.add(7);
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(10);

        System.out.println(integerPriorityQueue);

        System.out.println("--------------------------");
        integerPriorityQueue.remove();
        System.out.println(integerPriorityQueue);

        integerPriorityQueue.poll();
        System.out.println(integerPriorityQueue);

        System.out.println(integerPriorityQueue.peek());
    }
    public static void advanceExample() {
    Queue<Integer> queue = new PriorityQueue<>();

    queue.offer(8);

    queue.offer(2);

    queue.offer(5);

    queue.offer(1);

    queue.offer(7);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        queue.offer(3);

        System.out.println(queue.peek());

        System.out.println(queue.contains(7));

        queue.remove(7);

        System.out.println(queue);

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

        System.out.println(queue.poll());

        System.out.println(queue.peek());

    }

    public static void main(String[] args) {
        advanceExample();
    }

    }

