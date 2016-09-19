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
     * A better iterative solution would be to have two Node pointers
     * One of which moves n elements into the list and the other stays at the head
     * then move both one at a time until you reach the end and the other node will
     * be in the right place
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
     * This problem does not seem to work with a singly linked list given
     * the last element
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
     * However this probably isn't a solution someone would be looking for
     * Problem 2.5
     * @param first
     * @param second
     */
    public static int addLinkedList(Node first, Node second){
        int first_sum = 0;
        int second_sum = 0;
        Node next = first;
        int pow = 0;
        while (next != null){
            first_sum += next.data * Math.pow(10, pow);
            pow++;
            next = next.next;
        }
        next = second;
        pow = 0;
        while (next != null){
            second_sum += next.data * Math.pow(10, pow);
            pow++;
            next = next.next;
        }
        return first_sum + second_sum;
    }

    /**
     * Implementation of adding linked list with returning a linked list
     * Problem 2.5
     * Would be a helper function
     * @param first
     * @param second
     * @param carry
     * @return
     */
    public static Node addLinkedList2(Node first, Node second, int carry){
        if (first == null && second == null && carry == 0){
            return null;
        }
        Node ret = new Node(carry);
        int value = carry;
        if (first != null){
            value += first.data;
        }
        if (second != null){
            value += second.data;
        }

        ret.data = value % 10;

        if (first != null || second != null){
            Node next = addLinkedList2(first == null ? null : first.next, second == null ? null : second.next, (int)Math.floor(value/10));
            ret.next = next;
        }
        return ret;
    }

    /**
     * Given a circular linked list (with a loop somewhere), return the node that begins at the loop
     * Problem 2.6
     * @param head
     * @return
     */
    public static Node circularLL(Node head){
        Node next = head;
        Node slow = head;
        while (next != null && next.next != null){
            next = next.next.next;
            slow = slow.next;
            if (next == slow){
                break;
            }
        }
        if (next == null){
            return null;
        }
        slow = head;
        while (next != slow){
            next = next.next;
            slow = slow.next;
        }
        return next;
    }
}
