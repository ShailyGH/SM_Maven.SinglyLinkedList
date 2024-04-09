package com.zipcodewilmington.singlylinkedlist;

import java.util.Arrays;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <E extends Comparable<E>>
{

    public class Node<E extends Comparable<E>> implements Comparable<Node> {
        E data;
        Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public int compareTo(Node o) {
            return 0;
        }
    }

    Node[] nodes;
    Node head = null;

    public SinglyLinkedList() {
        this.nodes = new Node[0];
        this.head = null;
    }

    public void add(E data)
    {
        int nodeArraySize = this.nodes.length;
        if (nodeArraySize == 0)
        {
            this.nodes = new Node[] {new Node(data, null)};
            this.head = this.nodes[0];
        }
        else
        {
            Node[] newNodes = Arrays.copyOf(this.nodes, nodeArraySize + 1);
            Node newNode = new Node(data, null);
            newNodes[nodeArraySize - 1].next = newNode;
            newNodes[nodeArraySize] = newNode;
            this.nodes = newNodes;
        }
    }

    public void remove(int position)
    {
        int nodeArraySize = this.nodes.length;
        Node temp = head;
        int sizeOfList = length();
        if (position > sizeOfList || position < 1) {
            System.out.println("Invalid position provided");
        }

        if (position == 0) {
            head = temp.next;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        Node next = temp.next.next;
        temp.next = next;
    }

    public int length() {
        return this.nodes.length;

    }

    public boolean contains(int value) {
        return false;
    }

    public int find(int element) {
        return -1; // data not found
    }

    public int size() {
        return 0;
    }

    public int get(int index) {
        return 0;
    }

    public Node copy(Node myNode) {
        return newHead;
    }

    public void sort(Node myNode) {
    }
}
