package SinglyLinkedList;

public class MiddleLinkedList {
    private Node head;
    private static class Node{
     private int data;
     private Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public Node findNthFromLast(int n){
        Node refPtr=head;
        Node mainPtr=head;
        int count=0;
        while (count<n){
            refPtr=refPtr.next;
            count++;
        }
        while (refPtr!=null){
            mainPtr=mainPtr.next;
            refPtr=refPtr.next;
        }
        return mainPtr;
    }

    Node mergeSorted(Node a,Node b){

        Node dummy=new Node(0);
        Node tail=dummy;
        while (a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        if(b== null){
            tail.next=a;
        }
        return dummy.next;
    }

    public Node findMiddle(){
        Node fastPtr=head;
        Node slowPrt=head;
        while (fastPtr!=null && fastPtr.next!=null){
            slowPrt=slowPrt.next;
            fastPtr=fastPtr.next.next;
        }

        return slowPrt;
    }

    public static void main(String[] args) {
        MiddleLinkedList msl=new MiddleLinkedList();
        Node head=new Node(12);
        Node sec=new Node(45);
        Node third=new Node(56);
        Node fourth=new Node(10);
        Node fifth=new Node(5);
        msl.head=head;
        head.next=sec;
        sec.next=third;
        third.next=fourth;
        fourth.next=fifth;
        Node found=msl.findMiddle();
        System.out.println(found.data);
        ;
        Node last=msl.findNthFromLast(2);

        System.out.println("Find element at 2nd last position:"+last.data);
        System.out.println("Merged List");
        Node sorted=msl.mergeSorted(found,last);
        //create two singly linked list and put it in an argument;

    }
}
