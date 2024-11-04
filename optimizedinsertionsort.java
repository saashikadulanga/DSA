package arrayswapper;

import java.util.Arrays;

public class OptimizedInsertionSort {

    static Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
    static int outerIndex;
    static int temp;

    // Method to shift elements to make space for insertion
    public static int shift(int startIndex) {
        temp = array[startIndex];
        int i = startIndex;

        for (; i > 0 && array[i - 1] > temp; i--) {
            array[i] = array[i - 1];
            System.out.println("i=" + outerIndex + "; j=" + (outerIndex - i + 1) + ": " + Arrays.deepToString(array));
        }  
        return i; // Return the position where the temp value should be inserted
    }
    
    public static void insert(int endIndex) {
        int position = shift(endIndex);
        
        array[position] = temp;
        System.out.println("After i<" + outerIndex + " :" + Arrays.deepToString(array));
    }

    // Optimized insertion sort using the shift method
    public static void insertionSort() {
        for (outerIndex = 1; outerIndex < array.length; outerIndex++) {
            insert(outerIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial Array: " + Arrays.deepToString(array));
        insertionSort();
        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}