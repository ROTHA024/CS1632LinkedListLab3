public class CircularLinkedList {

    // Internal Node structure
    static class Node {
        int data;
        Node next;

        // Constructor for the dummy node (value doesn't matter)
        Node() {
            this.data = 0;
            this.next = null;
        }

        // Constructor for regular data nodes
        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    final Node dummy;

    // Constructor: Initializes an empty circular list containing only the dummy node
    public CircularLinkedList() {
        dummy = new Node();
        dummy.next = dummy; // Points to itself to make it circular
    }
}

