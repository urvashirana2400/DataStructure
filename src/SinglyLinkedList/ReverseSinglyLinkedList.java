package SinglyLinkedList;

public class ReverseSinglyLinkedList {
    private ReverseSinglyLinkedList head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void print(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data +"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList rsl=new ReverseSinglyLinkedList();
        ListNode head=new ListNode(23);
        ListNode first=new ListNode(56);
        ListNode two=new ListNode(10);
        ListNode three=new ListNode(35);
        ListNode four=new ListNode(90);

        head.next=first;
        first.next=two;
        two.next=three;
        three.next=four;

        rsl.print(head);

        System.out.println("reverse:");
        ListNode reverse=rsl.reverse(head);
        rsl.print(reverse);


    }
}
