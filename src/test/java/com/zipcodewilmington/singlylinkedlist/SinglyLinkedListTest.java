package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest
{
    private static SinglyLinkedList list;
    private SinglyLinkedList.Node expectedNode;

    @Before
    public void setup() {
        // Given
        list = new SinglyLinkedList();
        expectedNode = list.new Node(0);
        SinglyLinkedList.Node nd1 = list.new Node(456);
        SinglyLinkedList.Node nd2 = list.new Node(223);
        SinglyLinkedList.Node nd3 = list.new Node(189);

        // When
        expectedNode.add(nd1);
        expectedNode.add(nd2);
        expectedNode.add(nd3);
    }

    @Test
    public void testAdd()
    {
        // Then
        assertTrue("list size should be 3 ", expectedNode.size()==3);
    }
    @Test
    public void testRemove()
    {

    }

    @Test
    public void testContains()
    {

    }

    @Test
    public void testFind()
    {

    }

    @Test
    public void testSize()
    {


    }
    @Test
    public void testGet()
    {

    }

    @Test
    public void testCopy()
    {

    }

    @Test
    public void testSort()
    {

    }
}
