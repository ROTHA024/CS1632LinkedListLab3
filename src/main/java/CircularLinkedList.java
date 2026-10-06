public class CircularLinkedList {

    static class Node {
        int data;
        Node next;
        //dummy node
        Node() {
            this.data = -999;
            this.next = null;
        }
        //constructor
        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }
    final Node dummy;
    //constructor
    public CircularLinkedList() {
        dummy = new Node();
        dummy.next = dummy;
    }
    //addItem method to add new node
    public void addItem(int data){
        Node new_Node = new Node(data);
        Node current = dummy;
        while(current.next != dummy){
            current = current.next;
        }
        current.next = new_Node;
        new_Node.next = dummy;
    }
    //showList method displays teh data in the list
    public void showList(){
        if(dummy.next == dummy){
            System.out.println("List is empty");
            return;
        }
        Node current = dummy.next;
        while(current.next != dummy){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    //showReverse method will display the data values in the list in reverse
    public void showReverse(){
        if(dummy.next == dummy){
            System.out.println("List is empty");
            return;
        }
        reverseHelper(dummy.next);
    }
    //Helper function for showReverse
    public void reverseHelper(Node current){
        if(current == dummy){
            return;
        }
        reverseHelper(current.next);
        System.out.println(current.data + ", ");
    }
    //find method will tell if a certain value is in the list
    public void find(int value) {
        if(dummy.next == dummy){
            System.out.println("List is empty. Value cannot be found.");
            return;
        }
        Node current = dummy.next;
        while (current != dummy) {
            if (current.data == value) {
                System.out.println(value + " is in list.");
                return;
            }
            current = current.next;
        }
        System.out.println(value + " cannot be found in list.");
    }
    //remove method will remove the first instance of a given value in the list
    public void remove(int value){
        if(dummy.next == dummy) {
            System.out.println("List is empty");
            return;
        }
        Node previous = dummy;
        Node current = previous.next;
        while (current != dummy) {
            if (current.data == value) {
                previous.next = current.next;
                System.out.println(value + " has been removed.");
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println(value + " not found in list");
    }
}

