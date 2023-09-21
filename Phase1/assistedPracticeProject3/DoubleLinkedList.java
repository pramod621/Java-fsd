package assistedPracticeProject3;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void forwardTraversal() {
        Node current = head;
        System.out.print("Forward traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void backwardTraversal() {
        Node current = tail;
        System.out.print("Backward traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        myList.forwardTraversal();
        myList.backwardTraversal();
    }
}
