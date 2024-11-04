package selectionsort;

import java.util.Arrays;

public class SelectionSort {
    Integer[] a;

    // Constructor to initialize the array
    public SelectionSort(Integer[] a) {
        this.a = a;
    }

    // Method to perform selection sort
    public void selectionSort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
                
                // Print the state of the array after each comparison
                System.out.println(
                    "i = " + i +
                    "; j = " + j +
                    "; cur_min = " + a[min_idx] + 
                    "; " + Arrays.deepToString(a)
                );
            }
            
            // Swap the found minimum element with the first element
            swap(i, min_idx);
        }
    }

    // Method to swap two elements in the array
    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;  
    }

    // Main method for testing
    public static void main(String[] args) {
        Integer[] array = {76, 6,107,92,21,23,5,9,8143};
        SelectionSort sorter = new SelectionSort(array);
        sorter.selectionSort();
        System.out.println("Sorted array: " + Arrays.deepToString(array));
    }
}
