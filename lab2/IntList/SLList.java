package IntList;

public class SLList{

    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int x) {
            item = x;
            next = null;
        }
    }

    private IntNode first;
    public SLList(int x) {
        first = new IntNode(x);
    }

    public static void main () {
        System.out.println("hh");
        SLList t = new SLList(10);
    }
}
