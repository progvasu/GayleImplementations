package Chapter2;

/**
 *
 * @author vasu
 */

public class N2_KthFromLast {
    public static void main(String[] args) {
        // input
        LinkedList ll = new LinkedList();
        ll.addNodeTail(7);
        ll.addNodeTail(6);
        ll.addNodeTail(5);
        ll.addNodeTail(4);
        ll.addNodeTail(3);
        ll.addNodeTail(2);
        ll.addNodeTail(1);
        ll.printLL();
        
        // program
        ll.printKthLast(1);
        ll.printKthLast(2);
        ll.printKthLast(3);
        ll.printKthLast(4);
        ll.printKthLast(5);
        ll.printKthLast(6);
        ll.printKthLast(7);
    }
}
