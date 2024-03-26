package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest
{
    @Test
    public void testAdd()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList.Node expectedNode = list.new Node(0);
        SinglyLinkedList.Node nd1 = list.new Node(1);
        expectedNode.add(nd1);

        assertTrue("list size should be 1 ", expectedNode.size()==1);
    }
    @Test
    public void testRemove()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList.Node expectedNode = list.new Node(0);
        SinglyLinkedList.Node nd1 = list.new Node(1);
        SinglyLinkedList.Node nd2 = list.new Node(2);
        expectedNode.add(nd1);
        expectedNode.add(nd2);
        expectedNode.remove(0);

        assertTrue("list size should be 1 ", expectedNode.size()==1);
    }

    @Test
    public void testContains()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList.Node expectedNode = list.new Node(0);
        SinglyLinkedList.Node nd1 = list.new Node(12345);
        SinglyLinkedList.Node nd2 = list.new Node(55555);
        expectedNode.add(nd1);
        expectedNode.add(nd2);
        boolean expectedVal = expectedNode.contains(55555);
        Assert.assertEquals(true, expectedVal);
    }

    @Test
    public void testFind(){

    }

    @Test
    public void testSize(){

    }
    @Test
    public void testGet(){

    }

    @Test
    public void testCopy(){

    }

    @Test
    public void testSort(){

    }



}
