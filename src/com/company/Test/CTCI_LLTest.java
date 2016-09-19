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

    @org.junit.Test
    public void testAddLinkedList() throws Exception {
        Node first = new Node(1);
        first.appendToTail(2);
        first.appendToTail(3);
        Node second = new Node(2);
        second.appendToTail(9);
        second.appendToTail(9);
        assertTrue(CTCI_LL.addLinkedList(first, second) == 1313);
    }

    @org.junit.Test
    public void testAddLinkedList2() throws Exception {
        Node first = new Node(1);
        first.appendToTail(2);
        first.appendToTail(3);
        Node second = new Node(2);
        second.appendToTail(9);
        second.appendToTail(9);
        assertTrue(CTCI_LL.addLinkedList2(first, second, 0).printNodes().equals("3131")); //reverse order
    }

    @org.junit.Test
    public void testCircularLL() throws Exception {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;
        assertTrue(CTCI_LL.circularLL(first).data == 1);
    }
}