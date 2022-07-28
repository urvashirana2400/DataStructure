import java.util.EmptyStackException;

public class MaxHeap {
    private Integer[] heap;
    private int n;

    public MaxHeap(int capacity) {
        heap=new Integer[capacity+1];
        n=0;
    }

    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return n==0;
    }

    public void insert(int x){
        if(n==heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n]=x;
        swim(n);

    }
    public void resize(int capacity){
        Integer[] temp=new Integer[capacity];
        for(int i=0;i<heap.length;i++){
            temp[i]=heap[i];
        }
        heap=temp;
    }
    public void swim(int k){
        while(k>1 && heap[k/2] < heap[k]){
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }

    void print(){
        for(int i=1;i<=n;i++){
            System.out.println(heap[i]);
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(3);
        System.out.println("size:"+maxHeap.size());
        System.out.println(maxHeap.isEmpty());
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(2);
        maxHeap.insert(6);
        maxHeap.insert(1);
        maxHeap.insert(3);
        maxHeap.print();
    }
}
