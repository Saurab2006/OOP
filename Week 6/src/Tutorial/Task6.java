package Tutorial;

import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
 
        stack.push("A");
        stack.push("B");
        stack.push("C");   
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    
        stack.push("D");
        stack.push("E");
        System.out.println(stack.peek());
        System.out.println("Final Stack: " + stack);
    }
}