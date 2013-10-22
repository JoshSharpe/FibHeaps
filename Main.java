public class Main
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.addToFront(new ListNode(3));
        l.printList();
        l.addToFront(new ListNode(5));
        l.printList();
        ListNode newNode = l.removeFromFront();
        l.printList();
        System.out.printf("newNode: %d\n", newNode.getValue());


        LinkedList p = new LinkedList();
        p.addToFront(new ListNode(7));
        p.printList();
        p.addToFront(new ListNode(2));
        p.printList();

        FibNode f = new FibNode(0);
        f.getCurrentLevel().printList();

        FibHeap h = new FibHeap();
        h.insert(f);
        h.getRootList().printList();
        System.out.printf("Min so far: %d\n", h.getMin().getValue());
        h.insert(new FibNode(10));
        h.getRootList().printList();
        System.out.printf("Min so far: %d\n", h.getMin().getValue());
        h.insert(new FibNode(-1));
        h.getRootList().printList();
        System.out.printf("Min so far: %d\n", h.getMin().getValue());
    }
}
