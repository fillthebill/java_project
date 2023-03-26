package com.company;

public class SLList {

    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int x) {
            item = x;
            next = null;
        }
        public IntNode(int x, IntNode n) {
            item = x;
            next = n;
        }
    }

    private IntNode first;
    private int size;
    private IntNode last;

    public SLList(int x) {
        first = new IntNode(x);
        last = first;
        size = 1;
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
        size++;
    }

    public int getFirst() {
        return first.item;
    }
    public void printAll() {
        IntNode cur = first;
        while(cur != null) {
            System.out.println(cur.item);
            cur = cur.next;
        }
    }

    public void addLast(int x) {
        last.next = new IntNode(x);
        last = last.next;
        size++;
    }

    /**
    public int size() {
        return size;
    } **/

    private int size(IntNode n) {
        if(n.next == null) {
            return 1;
        }else {
            return 1+size(n.next);
        }

    }

    public int size() {
        return size(first);

    }
}
