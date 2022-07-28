package SortingAlgorithms;

public class QuickSort {
    public void sort(int a[], int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            sort(a, low, p - 1);
            sort(a, p + 1, high);
        }
    }

    public int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low;
        int j = low;
        while (i <= high) {
            if (a[i] <= pivot) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int a[] = {6, 8, 1, 4, 2, 9, 5};
        quickSort.sort(a, 0, a.length - 1);
        quickSort.printArray(a);
    }
}
