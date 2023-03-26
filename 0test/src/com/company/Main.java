package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        SLList t = new SLList(10);
        t.addFirst(5);
        int i = 9;
        while(i > 0) {
            t.addLast(i);
            //t.printAll();
            i--;
        }
        t.printAll();
        System.out.println(t.size());
    }
}
