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

        //while (!queue1.isEmpty()) {
            //System.out.println(queue1.poll());
        //}


        //LinkedList (Note: does not have index like ArrayList)
        //treat LinkedList like Stack

        LinkedList<String> linkedList = new LinkedList<String>();

//        linkedList.push("first person");
//        linkedList.push("second person");
//        linkedList.push("third person");


        linkedList.offer("first person");
        linkedList.offer("second person");
        linkedList.offer("third person");


        //added element at index 2
        linkedList.add(2, "after second person");


        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());



    }
}
