package com.codurance;

public class List<T> {

  private int size;
  private Node head;
  public T get(int index) {
    if (index >= size || index < 0){
      throw new IndexOutOfBoundsException();
    }

    Node result = head;

    for (int i = 0; index > i; i++){
      result = result.next;
    }

    return result.data;
  }

  public int size() {
    return size;
  }

  public void add(T data) {
    head = addNode(head, data);

    size++;
  }


  private Node addNode(Node node, T data){
    if (node == null){
      return new Node(data);
    }else if (node.next == null){
      node.next = new Node(data);
      return node;
    }else {
      node.next = addNode(node.next, data);
      return node;
    }
  }

  class Node {
    T data;
    Node next;

    public Node(T data) {
      this.data = data;
    }
  }
}

