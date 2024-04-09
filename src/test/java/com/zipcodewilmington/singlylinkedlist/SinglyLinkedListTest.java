package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest
{
    private SinglyLinkedList<Integer> myList;

    @Before
    public void setup()
    {
        myList = new SinglyLinkedList<Integer>();
    }

    @Test
    public void testAdd()
    {
        myList.add(5);
        Assert.assertEquals(1, myList.size());
        myList.add(2);
        myList.add(3);
        Assert.assertEquals(3, myList.size());
    }


    @Test
    public void testRemove()
    {
        myList.add(5);
        myList.add(9);
        myList.add(6);
        myList.remove(2);
        myList.add(3);
        myList.add(4);
        Assert.assertEquals(4, myList.size());
    }

    @Test
    public void testContains()
    {
        Assert.assertFalse(myList.contains(1));
        myList.add(5);
        myList.add(9);
        myList.add(6);
        Assert.assertTrue(myList.contains(9));
        Assert.assertTrue(myList.contains(6));
        Assert.assertFalse(myList.contains(2));
    }

    @Test
    public void testFind()
    {
        myList.add(5);
        myList.add(9);
        myList.add(6);
        myList.add(10);
        Assert.assertEquals(1, myList.find(9));
        Assert.assertEquals(3, myList.find(10));
        Assert.assertEquals(-1, myList.find(2));
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
