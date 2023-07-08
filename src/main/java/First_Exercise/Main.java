package First_Exercise;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Corolla");
        stack.push("CX-5");
        stack.push("Camry");


        System.out.println(stack.search("Camry"));
    }
}
