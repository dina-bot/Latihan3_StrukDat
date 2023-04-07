package kegiatan2;

public class Node {

    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(Object data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public Object remove() {
        if (isEmpty()) {
            return null;
        } else {
            Node currentNode = head;
            head = currentNode.next;
            return currentNode.data;
        }
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.data;
        }
    }
}

class Queue {

    LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void add(Object data) {
        list.add(data);
    }

    public Object remove() {
        return list.remove();
    }

    public Object element() {
        return list.peek();
    }

    public Object poll() {
        return list.remove();
    }

    public Object peek() {
        return list.peek();
    }
}
