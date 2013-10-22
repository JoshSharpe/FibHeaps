/**
    Creates a Circularly Double Linked List. Intended for use in a Fibonacci Heap. Uses the node in ListNode.java (@see ListNode.java). 
    @author Josh Sharpe
**/


public class LinkedList
{
private ListNode head;
private ListNode tail;
private int size;

public 
LinkedList()
{
    head = null;
    tail = null;
    size = 0;
}

public int
getSize()
{
    return this.size;
}

public ListNode
getHead()
{
    return this.head;
}

public ListNode
getTail()
{
    return this.tail;
}

public void
addToFront(ListNode newNode)
{
    if(this.isEmpty())
    {
        this.head = newNode;
        this.tail = newNode;
        this.head.setPrev(this.tail);
        this.tail.setNext(this.head);
    }
    else
    {
        newNode.setNext(this.head);
        newNode.setPrev(this.tail);
        this.head.setPrev(newNode);
        this.tail.setNext(newNode);
        this.head = newNode;
    }
    this.size++;
}

public ListNode
removeFromFront()
{
    ListNode oldHead = this.head;
    ListNode newHead = this.head.getNext();

    this.tail.setNext(newHead);
    newHead.setPrev(this.tail);
    this.size--;
    this.head = newHead;
    return oldHead;
}

public void
printList()
{
    ListNode tmp = this.head;
    System.out.printf("Forward list: ");
    for(int i=0; i<this.size; i++)
    {
        System.out.printf(" %d ", tmp.getValue());
        tmp = tmp.getNext();
    }
    System.out.printf("\n");

    tmp = this.tail;
    System.out.printf("Backward list: ");
    for(int i=0; i<this.size; i++)
    {
        System.out.printf(" %d ", tmp.getValue());
        tmp = tmp.getPrev();
    }
    System.out.printf("\n");
}

public boolean
isEmpty()
{
    return this.size == 0;
}


}
