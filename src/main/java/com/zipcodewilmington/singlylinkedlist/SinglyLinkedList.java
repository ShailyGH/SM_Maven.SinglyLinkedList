package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    public class Node {
        int data;

        Node next;

        Node head = null;

        Node tail = null;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void add(Node node) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void remove(int position) {
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
            if (head == null) {
                return 0;
            }
            int count = 0;
            Node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }
            return count;

        }

        public boolean contains(int value) {
            Node myNode = head;

            while (myNode != null) {
                if (myNode.equals(value)) {
                    return true;
                }
                myNode = myNode.next;
            }
            return false;
        }

        public int find(int element) {
            Node myNode = head;
            int count = 0;
            while (myNode != null) {
                if (myNode.data == element) {
                    return count; //data found
                }
                count++;
                myNode = myNode.next;
            }
            return -1; // data not found
        }

        public int size() {
            Node myNode = head;
            int count = 0;

            if (head == null) {
                return 0;
            }

            while (myNode != null) {
                count++;
                myNode = myNode.next;
            }
            return count;
        }

        public int get(int index) {
            Node myNode = head;
            int count = 0;
            while (myNode != null) {
                if (count == index) {

                    return myNode.data;
                }
                count++;
                myNode = myNode.next;
            }
            return 0;
        }

        public Node copy(Node myNode) {
            Node oldCurrent = myNode;
            Node newHead = new Node(oldCurrent.data);
            Node newCurrent = newHead;
            while ((oldCurrent = oldCurrent.next) != null) {
                newCurrent.next = new Node(oldCurrent.data);
                newCurrent = newCurrent.next;
            }
            return newHead;
        }

        public void sort(Node myNode) {
            Node current = head, index = null;
            int temp;

            if (head == null) {
                return;
            } else {
                while (current != null) {
                    //Node index will point to node next to current
                    index = current.next;

                    while (index != null) {
                        //If current node's data is greater than index's node data, swap the data between them
                        if (current.data > index.data) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }
    }
}
