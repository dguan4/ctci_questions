package com.company.Test;

import static org.junit.Assert.*;
import com.company.CTCI_LL;
import com.company.Node.Node;

/**
 * Created by Divide0 on 9/14/16.
 */
public class CTCI_LLTest {

    @org.junit.Test
    public void testRemomveDup() throws Exception {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(2);
        head = CTCI_LL.removeDup(head);
        assertTrue(head.printNodes().equals("12"));
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(2);
        head.appendToTail(3);
        assertTrue(CTCI_LL.removeDup(head).printNodes().equals("1234"));
    }

    @org.junit.Test
    public void testFindNth() throws Exception {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        assertTrue(CTCI_LL.findNth(head, 2) == 4);
        assertTrue(CTCI_LL.findNth(head, 3) == 3);
        assertTrue(CTCI_LL.findNth(head, 1) == 5);
    }

    @org.junit.Test
    public void testDeleteNode() throws Exception {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        Node temp = head;
        while (temp.data != 3){
            temp = temp.next;
        }
        CTCI_LL.deleteNode(temp);
        assertTrue(head.printNodes().equals("1245"));
    }
}