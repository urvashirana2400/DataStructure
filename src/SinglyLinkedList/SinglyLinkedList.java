package SinglyLinkedList;

public class SinglyLinkedList {

    private ListNode head;

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

    public void insert(int data){
        ListNode l=new ListNode(data);
        if(head==null){
            head=l;
        }else{
            l.next=head;
            head=l;
        }

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

    public void insertAtEnd(int data){
        ListNode newNode=new ListNode(data);
        if (head == null) {
            head=newNode;
        }else{
            ListNode current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

    }

    public void insertAt(int data,int index ){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
            int count=1;
            ListNode prev=head;
            while(count<index-1){
                prev=prev.next;
                count++;
            }
            ListNode current= prev.next;
            prev.next=newNode;
            newNode.next=current;
        }
    }

    public ListNode deleteAtFirst(){
        if(head==null){
            return null;
        }
        ListNode n=head;
        head=head.next;
        n.next=null;
        return n;
    }

    public  ListNode deleteAtLast(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        ListNode prev=null;
        while (current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
        return current;


    }

    public boolean search(int key){
        ListNode n=head;
        while (n!=null){
            if(n.data==key){
                return true;
            }

            n=n.next;
        }
        return  false;
    }

    public void print(){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data +"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public int findLength(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode sec=new ListNode(56);
        ListNode third=new ListNode(34);
        ListNode four =new ListNode(56);
        sll.head.next=sec;
        sec.next=third;
        third.next=four;
        //insert
        sll.insert(51);
        sll.insertAtEnd(12);
        //print the data

        //inserAt 3
        sll.insertAt(1,1);

        //delete at first
        //System.out.println("delete at first:"+sll.deleteAtFirst());
        //System.out.println("delete at last:"+sll.deleteAtLast());
        sll.print();
        System.out.println("length:"+sll.findLength());
        System.out.println("seatch for 10:"+sll.search(10));
        System.out.println("search for 20:"+sll.search(20));
        sll.print();

    }

}
