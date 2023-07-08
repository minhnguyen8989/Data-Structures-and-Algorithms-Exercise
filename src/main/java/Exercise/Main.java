package Exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Stack algorithms (LIFO) - Last In - First Out
        Stack<String> stack = new Stack<String>();
        stack.push("first person");
        stack.push("second person");
        stack.push("third person");

        //this to remove the last element in line.
        stack.pop();

        //System.out.println(stack.peek()); //see last element (third person)
        //System.out.println(stack);


        //Queue algorithms (FIFO) - First In, First Out (First come first serve)
        //add = enqueue, offer()
        //remove = dequeue, poll()
        Queue<String> queue = new LinkedList<>();
        queue.offer("first person");
        queue.offer("second person");
        queue.offer("third person");

        //this to remove the first person in line.
        queue.poll();

        //System.out.println(queue.peek()); //see first element (first person)
        //System.out.println(queue);


        //Priority Queue - FIFO (priorities serve first)

        Queue<String> queue1 = new PriorityQueue<>();

        queue1.offer("B");
        queue1.offer("D");
        queue1.offer("A");
        queue1.offer("H");

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }







    }
}
