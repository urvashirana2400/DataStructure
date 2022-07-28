package SortingAlgorithms;

import java.beans.PropertyEditorSupport;

public class MergeArrays {

    public int[] mergeTwoArrays(int a1[],int a2[]){
        int n=a1.length;
        int m=a2.length;
        int result[] =new int[n+m];
        int i=0;int j=0;int k=0;
        while (i<n && j<m){
            if(a1[i]<a2[j]){
                result[k]=a1[i];
                i++;
            }
            else{
                result[k]=a2[j];
                j++;
            }
            k++;
        }
        while (i<n){
            result[k]=a1[i];
            i++;k++;
        }
        while (j<m){
            result[k]=a2[j];
            j++;k++;
        }
        return result;
    }
    public void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        MergeArrays mergeArrays=new MergeArrays();
        int a1[]={3,7,8,9};
        int a2[]={1,2,3,4};
        int result[]= mergeArrays.mergeTwoArrays(a1,a2);
        mergeArrays.printArray(result);

    }
}
