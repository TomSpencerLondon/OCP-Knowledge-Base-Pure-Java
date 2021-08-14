package com.codurance.algorithms.stack.max.src.main.java.com.codurance.max;

public class Max {
    public static void main(String[] args) {
        push(5);
        push(10);
        push(3);
        push(20);

        pop();

        System.out.println(max());
    }

    private static class Node {
        private int value;
        private Node next;
        private Node oldMax;
    }

    private static Node stack;
    private static Node max;

    public Max() {}

    public static void push(int x) {
        Node n = new Node();
        n.value = x;

        if (stack == null) {
            stack = n;
        }else {
            n.next = stack;
            stack = n;
        }

        if (max == null || n.value > max.value) {
            n.oldMax = max;
            max = n;
        }
    }

    public static int pop() {
        if (stack == null) throw new NullPointerException();
        Node n = stack;

        stack = n.next;

        if (n.oldMax != null){
            max = n.oldMax;
        }

        return n.value;
    }

    public static int max() {
        if (max == null) throw new NullPointerException();
        return max.value;
    }
}
