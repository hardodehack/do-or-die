package tech.hardik.practice.algoexpert.io.main;

import tech.hardik.practice.algoexpert.io.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.printLinkedList();
        linkedList.insertAtFirst(12);
        linkedList.insertAtFirst(88);
        linkedList.insertAtFirst(22);
        linkedList.insertAtFirst(33);
        linkedList.insertAtLast(99);
        linkedList.insertAtFirst(11);
        linkedList.printLinkedList();
        linkedList.clear();
        linkedList.printLinkedList();
    }
}