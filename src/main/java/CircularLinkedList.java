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
}

