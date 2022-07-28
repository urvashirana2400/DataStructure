package CircularLinkedList;

public class CircularLinkedList {
    private Node last;
    private int length;

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void createCircularLinkedList(){
        Node first=new Node(34);
        Node second= new Node(56);
        Node third=new Node(54);
        Node fourth=new Node(23);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }

    public void print(){
        if(last==null){
            return;
        }
        Node n=last.next ;
        if(n!=last){
            System.out.print(n.data +" ");
            n=n.next;
        }
        System.out.print(n.data);
    }

    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
        cll.createCircularLinkedList();
        cll.print();

    }
}
