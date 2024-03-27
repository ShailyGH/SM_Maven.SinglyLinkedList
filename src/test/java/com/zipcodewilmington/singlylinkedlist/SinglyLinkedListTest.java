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
        // Given
        expectedNode.remove(0);

        // Then
        assertTrue("list size should be 2 ", expectedNode.size()==2);
    }

    @Test
    public void testContains()
    {
        // Then
        Assert.assertEquals(false, expectedNode.contains(123));
    }

    @Test
    public void testFind()
    {
        // Then
        Integer expected = 0;
        Integer actual = expectedNode.find(123);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize()
    {
        // Then
        Integer expected = 2;
        Integer actual = expectedNode.size();
        Assert.assertEquals(expected, actual);

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
