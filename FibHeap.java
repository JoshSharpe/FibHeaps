
public class FibHeap
{

private FibNode min;
private int count;
private LinkedList rootList;

public 
FibHeap()
{
    min = null;
    count = 0;
    rootList = new LinkedList();
}

public FibNode
getMin()
{
    return this.min;
}

public int
getCount()
{
    return this.count;
}

public LinkedList
getRootList()
{
    return this.rootList;
}

public void
insert(FibNode newNode)
{
    if(this.min == null)
    {
        this.rootList.addToFront(newNode);
        this.min = newNode;
    }
    else
    {
        this.rootList.addToFront(newNode);
        if(newNode.getValue() < this.min.getValue())
        {
            this.min = newNode;
        }
    }

    this.count++;
}

/*
public FibNode
findMin()
{

}

public FibNode
extractNode()
{

}

public FibHeap
union(FibHeap h1, FibHeap h2)
{

}

public void
decreaseKey(FibNode node, int newVal)
{

}

public void
delete(FibNode node)
{

}
*/

}//end class
