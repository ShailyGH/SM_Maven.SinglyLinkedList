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
        Node[] newNodes = new Node[nodeArraySize-1];
        if(position != 0 && position < nodeArraySize - 1)
        {
            this.nodes[position - 1].next = this.nodes[position + 1];
        }
        else if(position == nodeArraySize - 1)
        {
            this.nodes[position - 1].next = null;
        }
        for (int i = 0, k = 0; i < this.nodes.length; i++) {
            if (i != position) {
                newNodes[k++] = this.nodes[i];
            }
        }
        this.nodes = newNodes;
        this.head = this.nodes[0];
    }

    public int size() {
        return this.nodes.length;
    }


    public boolean contains(E data)
    {
        for (Node node : this.nodes) {
            if (node.data.equals(data)) {
                return true;
            }
        }
        return false;
    }


    public int find(E data)
    {
        for (int i = 0;i < this.nodes.length; i++)
        {
            if (this.nodes[i].data.equals(data)) {
                return i;
            }
        }
        return -1; // data not found
    }

    public E get(int index) {
        if((index > this.nodes.length - 1) || (index < 0))
        {
            return null;
        }
        return (E) this.nodes[index].data;
    }

    /*
    public Node copy(Node myNode) {
        return newHead;
    }

    public void sort(Node myNode) {
    }

     */
}
