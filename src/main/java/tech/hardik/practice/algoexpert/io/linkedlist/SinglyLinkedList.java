package tech.hardik.practice.algoexpert.io.linkedlist;

public class SinglyLinkedList {

    Node head;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentHead = head;
            head = newNode;
            head.next = currentHead;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
    }

    public void printLinkedList() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data + "  ");
                currentNode = currentNode.next;
            }
        }
        System.out.println("-------------------------");
    }

    public void clear() {
        head = null;
    }
}

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }
}
