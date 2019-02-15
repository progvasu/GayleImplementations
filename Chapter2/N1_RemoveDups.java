package Chapter2;

// assuming we are allowed to use a buffer
// if we are not allowed to use a buffer then 
// running time = N^2 no other option

import java.util.HashSet;

/**
 *
 * @author vasu
 */


public class N1_RemoveDups {
    public static void main(String[] args) {
        // input
        LinkedList ll = new LinkedList();
        ll.addNodeTail(0);
        ll.addNodeTail(0);
        ll.addNodeTail(1);
        ll.addNodeTail(2);
        ll.addNodeTail(3);
        ll.addNodeTail(4);
        ll.addNodeTail(5);
        ll.addNodeTail(2);
        ll.addNodeTail(6);
        ll.addNodeTail(3);
//        ll.addNodeTail(0);
        
        ll.printLL();
        ll.removeDups();
        ll.printLL();
    }
}
