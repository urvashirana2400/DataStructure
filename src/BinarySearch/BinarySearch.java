package BinarySearch;

public class BinarySearch {
    public int binarySearchAlgo(int a[],int key){
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            if(key<a[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
    BinarySearch bs=new BinarySearch();
    int a[]={2,5,7,9,10,45,67};
        System.out.println("element is in position:"+ bs.binarySearchAlgo(a,67));
    }
}
