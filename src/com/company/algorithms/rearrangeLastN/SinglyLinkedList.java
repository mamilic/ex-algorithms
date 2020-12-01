package com.company.algorithms.rearrangeLastN;

public class SinglyLinkedList<T> {
    private Node<T> node;
    private Integer size;

    public SinglyLinkedList(T value) {
        node = new Node<T>(value);
        size = 1;
    }

    public void add(T value) {
        size++;
        addRecursive(value, node);
    }

    public T get(Integer index) {
        return node(index).value;
    }

    private Node<T> node(Integer index) {
        Node current = node;
        Integer currIndex = 0;
        while (current != null) {
            if (currIndex == index) {
                return current;
            }
            currIndex++;
            current = current.next;
        }
        return null;
    }

    private void addRecursive(T value, Node<T> current) {
        if (null == current.next) {
            current.next = new Node<T>(value);
            return;
        }
        addRecursive(value, current.next);
    }

    public void print() {
        for (Node<T> x = node; x != null; x = x.next) {
            System.out.println(x.value);
        }
    }

    public Node<T> rearrangeLastN(int n) {
        int index = 1;
        Node<T> toBeUnliked = null;
        Node<T> toBeFirst = null;
        Node<T> current = node;

        do {
            if (current.next == null) {
                current.next = node;
                break;
            }

            if (index == n - 1) {
                toBeUnliked = current;
                toBeFirst = current.next;
            }
            current = current.next;

            index++;
        } while (null != current);

        toBeUnliked.next = null;
        node = toBeFirst;
        return node;
    }

    public Integer size() {
        return size;
    }

    public class Node<T> {
        T value;
        Node<T> next;

        public Node(T x) {
            value = x;
        }
    }
}
