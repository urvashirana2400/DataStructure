package SortingAlgorithms;

public class SelectionSort {
    public void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public void performSelectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }

    public static void main(String[] args) {
    SelectionSort selectionSort=new SelectionSort();
        int a[]={4,2,6,8,1,9};

    selectionSort.performSelectionSort(a);
    selectionSort.printArray(a);
    }
}
