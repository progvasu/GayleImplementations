/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

import java.util.HashSet;

/**
 *
 * @author vasu
 */
class LinkedList    {
    Node head;

    LinkedList() {
        head = null;
    }
    
    class Node  {
        int key;
        Node next;
        
        Node(int key)   {
            this.key = key;
            this.next = null;
        }    
    }
    
    void addNodeTail(int key)   {
        if (head == null)
            head = new Node(key);
        else    {
            Node runn = head;
            while (runn.next != null)
                runn = runn.next;
            
            runn.next = new Node(key);
        }
    }
    
    void printLL()  {
        Node temp = head;
        if (temp == null)
            return;
        while (temp.next != null)    {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.key);
    }
    
    void removeDups()   {
        if (head == null)
            return;
        
        HashSet<Integer> hash = new HashSet<>();
        Node runn = null, prev = null;
        
        hash.add(head.key);
        prev = head;
        runn = head.next;
        
        while (runn != null)    {
            if (!hash.contains(runn.key))   {
                hash.add(runn.key);
                prev = runn;
            }
            else
                prev.next = runn.next;
            
            runn = runn.next;
        }
    }
    
    void printKthLast(int pos)  {
        KthLastRecur(head, pos);
        
        // using the iterative method
        // have two pointers
        
        Node run1 = head, run2 = head;
        // move run2 pos position forward
        while (pos-- > 0)
            run2 = run2.next;
        
        while (run2 != null)    {
            run1 = run1.next;
            run2 = run2.next;
        }
        
        System.out.println("Kth Last Element - Itert: " + run1.key);
    }
    
    int KthLastRecur(Node node, int pos)    {
        if (node == null)
            return 0;
        
        int index = KthLastRecur(node.next, pos) + 1;
        
        if (index == pos)
            System.out.println("Kth Last Element - Recur: " + node.key);
        
        return index;
    }
    
    void deleteMiddle(int key)  {
        // in the original program we are given the middle element
        // instead we write a little code to get the middle element
        // point is dont use the prev pointer for deleting the middle node
        Node middle = head;
        
        // assuming the key supplied exists in the LL
        while (middle.key != key)
            middle = middle.next;
        
        // program starts - according to the question given
        // copy value of nect node to this node
        // and delete the next node
        
        // is middle the last node
        if (middle.next == null)    {
            System.out.println("Cant Delete - Maybe make a Dummy Node");
            return;
        }
            
        middle.key = middle.next.key;
        middle.next = middle.next.next;
    }
    
    void partitionStable(int positionKey)    {
        // in place partitioning
        Node firstS = null, firstE = null, secS = null, secE = null;
        
        while (head != null)    {
            if (head.key < positionKey) {
                if (firstS == null) {
                    firstS = head;
                    firstE = head;
                }
                else    {
                    firstE.next = head;
                    firstE = firstE.next;
                }
            }
            else    {
                if (secS == null) {
                    secS = head;
                    secE = head;
                }
                else    {
                    secE.next = head;
                    secE = secE.next;
                }
            }
            
            head = head.next;
        }
        
        if (firstS == null) {
            head = secS;
            secE.next = null;                  
        }
        else if (secS == null)  {
            head = secS;
            secE.next = null;
        }
        else    {
            firstE.next = secS;
            secE.next = null;
            head = firstS;
        }
    }
}
