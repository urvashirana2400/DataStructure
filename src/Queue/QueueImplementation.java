package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    private Node front;
    private Node rear;
    private int length;
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            front=newNode;
        }else {
            rear.next=newNode;
        }
        rear=newNode;
        length++;

    }
    public int dequeue(){
        if(isEmpty()){
            return 0;
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void print(){
        Node n=front;
        while (n!=rear){
            System.out.println(n.data+ " ");
            n=n.next;
        }
        System.out.println("null");
    }
    public String[] generateBinaryNumber(int n){
        Queue<String> q=new LinkedList<>();
        String result[]=new String[n];
        q.offer("1");
        for(int i=0;i<n;i++){
            result[i]=q.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            q.offer(n1);
            q.offer(n2);

        }
        return result;
    }

    public static void main(String[] args) {

        QueueImplementation q=new QueueImplementation();
        q.enqueue(78);
        q.enqueue(98);
        q.enqueue(80);
        q.enqueue(75);
        q.enqueue(71);
        q.print();
        q.dequeue();
        q.print();
        System.out.println("generate binary for 7");
        String result[]=q.generateBinaryNumber(7);
        for(String s:result){
            System.out.println(s);
        }



    }
}
