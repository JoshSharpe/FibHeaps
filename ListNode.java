/**
    This file creates a node that can be used with LinkedList.java (@see LinkedList.java). 
    @author Josh Sharpe
    Last modified: Oct. 21, 2013.
**/

public class ListNode
{

/** 
    A node that is intended to be used in a Doubly Linked List. 
    Attributes: int value, ListNode prev, ListNode next. 
**/

private int value;
private ListNode prev;
private ListNode next;

/*  Constructors */
/**
    Constructor for the ListNode where prev and next are not provided.
    @param value the key of the node.
**/
public 
ListNode(int value)
{
    this.value = value;
    this.prev = null;
    this.next = null;
}

/**
    Constructor for the ListNode where prev and next are provided.
    @param value the key of the node.
    @param next the node that this node will be pointing to.
    @param prev the other node that this node will be pointing to.
**/
public 
ListNode(int value, ListNode prev, ListNode next)
{
    this.value = value;
    this.prev = prev;
    this.next = next;
}

/* Getters */
/**
    Getter for {@link #value}
    @return {@link #value}
**/
public int
getValue()
{
    return this.value; 
}

/**
    Getter for {@link #prev}
    @return {@link #prev}
**/
public ListNode
getPrev()
{
    return this.prev; 
}

/**
    Getter for {@link #next}
    @return {@link #next}
**/
public ListNode
getNext()
{
    return this.next; 
}

/* Setters */
/**
    Setter for {@link #value}
    @param newValue An integer that the value will now be set to.
**/
public void
setValue(int newValue)
{
    this.value = value;
}


/**
    Setter for {@link #prev}
    @param newPrev A new ListNode that the prev will now be set to.
**/
public void
setPrev(ListNode newPrev)
{
    this.prev = newPrev; 
}

/**
    Setter for {@link #next}
    @param newNext A new ListNode that the next will now be set to.
**/
public void
setNext(ListNode newNext)
{
    this.next = newNext; 
}

}//end Node class
