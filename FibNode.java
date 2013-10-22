public class FibNode extends ListNode
{
private int key;
private FibNode parent;
private LinkedList currentLevel;
private LinkedList child;
private int degree;
private boolean mark;

public
FibNode(int key)
{
    super(key);
    this.parent = null;
    this.currentLevel = new LinkedList();
    currentLevel.addToFront(this);
    this.child = null;
    this.degree = 0; 
    this.mark = false;
}

public FibNode
getParent()
{
    return this.parent;
}

public LinkedList
getCurrentLevel()
{
    return this.currentLevel;
}

public LinkedList
getChild()
{
    return this.child;
}

public int
getDegree()
{
    return this.degree;
}

public boolean
getMark()
{
    return this.mark;
}

public void
setParent(FibNode newParent)
{
    this.parent = newParent; 
}

public void
setSibling(FibNode newSibling)
{
    this.currentLevel.addToFront(newSibling);
}

public void
setChild(LinkedList newChild)
{
    this.child = newChild;
}

public void
setMark(boolean newMark)
{
    this.mark = newMark;
}

}//end class
