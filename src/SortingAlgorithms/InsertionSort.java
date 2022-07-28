package SortingAlgorithms;

public class InsertionSort {
    void performInsertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while (j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
    }
    public void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        InsertionSort insertionSort=new InsertionSort();
        int a[]={4,2,6,8,1,9};
        insertionSort.performInsertionSort(a);
        insertionSort.printArray(a);
    }
}
