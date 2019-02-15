package Chapter3;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author vasu
 */
public class N5_SortStacks {
    static Stack<Integer> stack = new Stack<>();
    
    static void printStack()    {
        System.out.println(stack.peek());
        System.out.println(Arrays.toString(stack.toArray()));
    }
    
    static void sortStack() {
        Stack<Integer> temp_stack = new Stack<>();
        
        // sort logic
        // elements in temp_stack are in reverse sorted order
        while(!stack.isEmpty()) {
            int temp_ele = stack.pop();
            
            while(!temp_stack.isEmpty() && temp_ele < temp_stack.peek())
                stack.push(temp_stack.pop());
            
            temp_stack.push(temp_ele);
        }
        
        // push elements back to stack
        while(!temp_stack.isEmpty())
            stack.push(temp_stack.pop());
    }
    
    public static void main(String[] args) {
        // setting input
        int n = 10;
        
        for (int i = 0 ; i < n ; i++)
            stack.push((int)(Math.random() * 1000 + 1));
        
        
        sortStack();
        
        printStack();
    }
}
