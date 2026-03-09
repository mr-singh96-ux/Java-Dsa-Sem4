package LinkedList;

public class insertion {

    static Node insertAtBeg(int data, Node head){
        Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return head;
    }

    static Node insertAtLast(int data, Node head){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

        return head;
    }

    static Node insertAtpos(int data, int pos, Node head){
        Node newNode = new Node(data);
        if(pos== 1){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node curr = head;
        for(int i=0;i<pos-1 && curr != null ; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
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

    head = insertAtBeg(15, head);
    head = insertAtLast(200, head);
    head = insertAtLast(42, head);
    head = insertAtpos(31, 3, head);

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