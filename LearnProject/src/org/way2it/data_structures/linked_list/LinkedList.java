package org.way2it.data_structures.linked_list;

import java.util.Objects;

public class LinkedList {

    // Represents the first node of this list
    // Should be initialized when first value is added
    private Node head;

    // Represents the number of values that were added to this list
    private int length = 0;

    public LinkedList() {
    }

    // Should add new value to the end of the list and increment length
    public void add(String value) {
        if(head == null) {
            head = new Node();
            head.value = value;
            head.next = new Node();
        } else {
            addNodeToList(value, head.next);
        }
        length++;
    }

    // Should add new value next to specified afterValue, increment length and return true
    // If afterValue is not present in list - do nothing and return false.
    public boolean addAfter(String value, String afterValue) {
        Node searchNode = findNode(afterValue, head);
        if (searchNode == null) {
            return false;
        } else {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = searchNode.next;
            searchNode.next = newNode;
            length ++;
            return true;
        }

    }

    // Should return true if value exists in this list, false - otherwise
    public boolean contains(String value) {
        if (head == null) {
            return false;
        } else {
            return findNode(value, head) != null;
        }
    }

    // Should remove first occurrence of the specified value from this list and decrement the length
    // If value existed and was removed - return true, false - otherwise
    public boolean remove(String value) {
        Node searchNode = findNode(value, head);
        if (searchNode == null) {
            return false;
        }

        if (searchNode == head)  {
            head= head.next;
        } else {
            Node parentNode = findParentNode(searchNode, head.next);
            parentNode.next = searchNode.next;
        }
        length --;
        return true;
    }

    public int getLength() {
        return length;
    }

    private static class Node {
        String value;
        Node next;
    }

    private static void addNodeToList(String value, Node nodeElement) {
        if (nodeElement.value == null) {
            nodeElement.value = value;
            nodeElement.next = new Node();
        } else {
           addNodeToList(value, nodeElement.next);
        }
    }

    private static Node findNode(String value, Node nodeElement) {
        if (nodeElement == null) {
            return null;
        } else if (Objects.equals(nodeElement.value, value)) {
            return nodeElement;
        } else {
            return findNode(value, nodeElement.next);
        }

    }

    private static Node findParentNode (Node searchNode, Node currentNode) {
        if (searchNode == currentNode.next) {
            return currentNode;
        } else {
            return  findParentNode(searchNode, currentNode.next);
        }
    }
}
