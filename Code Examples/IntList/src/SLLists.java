public class SLLists {
    private IntNode first;
    private int size;
    //The first item (if it exists) is at sentinel.next
    private IntNode sentinel;

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    //Creates an empty SLList
    public SLLists() {
        sentinel = new IntNode(63,null);
        first = null;
        size = 0;
    }

    public SLLists(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    //Adds x to the front of the list
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public void addLast(int x) {
        size++;
        IntNode p = sentinel;

        //Move p until it reaches the end of the list
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    //Returns the size of the list that starts at IntNode p
//    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//
//        return 1 + size(p.next);
//    }

    public int size() {
        return size;
    }

    //Returns the first item in the list
    public int getFirst() {
        return sentinel.next.item;
    }


    public static void main(String[] args) {
        //Creates a list of one integer, namely 10
        SLLists L = new SLLists(15);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
    }
}
