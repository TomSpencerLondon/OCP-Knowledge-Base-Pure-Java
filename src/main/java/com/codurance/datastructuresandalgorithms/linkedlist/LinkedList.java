package com.codurance.datastructuresandalgorithms.linkedlist;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Iterator;

class Node {
  Node next;
  int data;

  public Node(int data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("next", next)
        .append("data", data)
        .toString();
  }
}

public class LinkedList<T> implements Iterable<Node> {
  Node head;

  public void append(int data){
    if (head == null){
      head = new Node(data);
      return;
    }

    Node current = head;
    while (current.next != null){
      current = current.next;
    }
    current.next = new Node(data);
  }

  public void prepend(int data) {
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  public void deleteWithValue(int data){
    if (head == null) return;
    if (head.data == data) {
      head = head.next;
      return;
    }

    Node current = head;
    while (current.next != null){
      if (current.next.data == data){
        current.next = current.next.next;
        return;
      }

      current = current.next;
    }
  }

  public static void main(String[] args) {
    final LinkedList linkedList = new LinkedList();
    linkedList.append(1);
    linkedList.append(2);
    linkedList.append(3);
    linkedList.append(4);

    linkedList.deleteWithValue(3);

    for (Object n : linkedList){
      System.out.println(n);
    }
    System.out.println(linkedList);
  }


  public Iterator<Node> iterator() {
    return new Iterator<Node>() {

      Node current = head;

      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public Node next() {
        if (hasNext()) {
          Integer data = current.data;
          current = current.next;
          return new Node(data);
        }
        return null;
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException("Remove not implemented.");
      }

    };

  }

}
