package com.company.Node;

/**
 * From CTCI simple linked list implementation
 */
public class Node {
    public Node next = null;
    public int data;

    public Node(int d){
        data = d;
    }

    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode (Node head, int d){
        Node n = head;

        if (n.data == d){
            return head.next;
        }

        while (n.next != null){
            if (n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public String printNodes () {
        String retString = "";
        Node n = this;

        while (n != null){
            retString += n.data;
            n = n.next;
        }

        return retString;
    }
}
