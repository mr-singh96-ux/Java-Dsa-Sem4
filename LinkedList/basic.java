package LinkedList;

public class basic {

    static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head;
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        head = n1;
        n1.next = n2;
        n2.next =n3;
        n3.next = n4;
        display(head);
    }
    
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}