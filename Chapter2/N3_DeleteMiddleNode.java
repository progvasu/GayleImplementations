/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author vasu
 */
public class N3_DeleteMiddleNode {
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
        ll.deleteMiddle(1);
        ll.printLL();
    }
}
