package Linked_List;

public class LL{

    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "--->");
            temp = temp.next;
        }
        System.out.print("End");
    }
}
