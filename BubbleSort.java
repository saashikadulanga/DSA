import java.util.Arrays;

public class BubbleSort {
    
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // Initialize an array of integers to sort
        int[] numbers = new int[]{8, 3, 1, 4, 5, 11, 7, 2, 17, 13};
        
        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        
        // Create an instance of BubbleSort and sort the array
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(numbers);
        
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
    }
}
