package DoublyLinkedList;

import java.util.PrimitiveIterator;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length=0;

    private static class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int getLength(){
        return length;
    }

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            tail=newNode;
        }else {
            head.prev=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        /*Node head=new Node(12);
        Node fisrt=new Node(10);
        Node sec=new Node(62);
        Node third=new Node(82);

        dll.head=head;
        head.next=fisrt;
        fisrt.next=sec;
        sec.next=third;*/
        dll.insertAtBeginning(34);
        dll.insertAtEnd(2);
        dll.display();

    }
}
