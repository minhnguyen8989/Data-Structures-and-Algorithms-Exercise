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


        //added element at index 2 (inserting element at any index)
        linkedList.add(2, "after second person");


//        System.out.println(linkedList);
//        System.out.println(linkedList.peekFirst());
//        System.out.println(linkedList.peekLast());

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("My name is Minh");
//        System.out.println(arrayList);


        //Linear Search - Linear Time (Run Time)
        int[] array1 = {4, 5, 2, 7, 3, 2, 1, 6, 8};
        int index1 = linearSearch(array1, 5);

        if (index1 != -1) {
            //System.out.println("Element found at index: " + index);
        } else {
            //System.out.println("Element NOT found");
        }


        //Binary Search - logarithmic time (Run Time) - good for data has million Elements
        int array[] = new int[100000];
        int target = 30;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//      int index2 = Arrays.binarySearch(array, target);
        int index2 = binarySearch(array, target);

        if (index2 == -1) {
            //System.out.println("Element NOT Found");
        } else {
            //System.out.println("Element found at: " + index2);
        }


//        Interpolation Search
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index3 = interpolationSearch(array3, 8);

        //System.out.println("Element found at: " + index3);


//        Bubble Sort - NO GOOD for large set of data - O(n^2) runtime
        int[] array4 = {4, 5, 2, 7, 3, 2, 1, 6, 8, 10, 9};
        bubbleSort(array4);

        for (int i : array4) {
//            System.out.println(i);
        }


//        Selection Sort - NO GOOD for large set of data - O(n^2) runtime
        selectionSort(array4);

        for (int i : array4) {
            System.out.println(i);
        }

    }


    private static void selectionSort(int array[]) {
        for(int i = 0; i < array.length  -1 ; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }



    private static void bubbleSort(int array4[]) {
        for (int i = 0; i < array4.length - 1; i++) {
            for (int j = 0; j < array4.length - i - 1; j++) {
                if (array4[j] > array4[j + 1]) {
                    int temp = array4[j];
                    array4[j] = array4[j + 1];
                    array4[j + 1] = temp;
                }
            }
        }
    }


    private static int interpolationSearch(int[] array3, int value3) {

        int high = array3.length -1;
        int low = 0;

        while(value3 >= array3[low] && value3 <= array3[high] && low <= high) {
             int probe = (high - low) * (value3 - array3[low]) / (array3[high] - array3[low]);

            //System.out.println("probe: " + probe);

            if(array3[probe] == value3) {
                return probe;
            }else if (array3[probe] < value3) {
                low = probe + 1;
            }else {
                high = probe -1;
            }
        }
        return -1;
    }


    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1;

        while(low <= high) {
            int middle = low + (high - low)/2;
            int value = array[middle];

            //System.out.println("middle: " + value);

            if(value < target) {
                low = middle + 1;
            }else if (value > target) {
                high = middle -1;
            }else {
                return middle; //target Found
            }

        }

        return -1;// target NOT found
    }


    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


}

