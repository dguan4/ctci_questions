package com.company;

import com.company.Node.Node;

public class CTCI_LL {

    /**
     * Removes duplicates from an unsorted linked list
     * Returns the head when done
     * Runs in O(n^2) time without using extra space. However with a hashmap/hashtable
     * can be reduced to O(n)
     * Problem 2.1
     * @param head
     */
    public static Node removeDup(Node head){
        Node curr = head;
        Node next = head;
        while (curr != null){
            next = curr;
            while (next.next != null){
                if (curr.data == next.next.data){
                    next.next = next.next.next;
                }
                else {
                    next = next.next;
                }
            }
            curr = curr.next;
        }
        return head;
    }

    /**
     * Finds the nth to last element in a linked list
     * Problem 2.2
     * @param head
     * @param n
     * @return
     */
    public static int findNth(Node head, int n){
        int length = 0;
        Node next = head;
        while (next != null){
            length++;
            next = next.next;
        }
        next = head;
        int stop = length - n;
        for (int i = 0; i < stop; i++){
            next = next.next;
        }
        return next.data;
    }

    /**
     * Delete a node from a linked list given only access to that node
     * Problem 2.3
     * @param del
     */
    public static void deleteNode(Node del){
        if (del == null || del.next == null){
            return;
        }
        Node next = del.next;
        del.data = next.data;
        del.next = next.next;
    }

    /**
     * Given two linked lists which represents numbers in reverse order, add them up
     * @param first
     * @param second
     * @param carry
     */
    public static void addLinkedList(Node first, Node second, int carry){
        int total = 0;
        return;
    }
}
