package adsDay6;

import java.util.Arrays;

public class HeapSort {

    static void heapify(int[] arr, int heapSize, int rootIndex) {
        int largestValueIndex = rootIndex; 

        int leftChildIndex = 2 * rootIndex + 1; 
        int rightChildIndex = 2 * rootIndex + 2;

        // Check if left child is larger than root
        if (leftChildIndex < heapSize && arr[leftChildIndex] > arr[largestValueIndex]) {
            largestValueIndex = leftChildIndex;
        }

        // Check if right child is larger than the largest so far
        if (rightChildIndex < heapSize && arr[rightChildIndex] > arr[largestValueIndex]) {
            largestValueIndex = rightChildIndex;
        }
        
        // If largest is not root, swap and continue heapifying
        if (largestValueIndex != rootIndex) {
            int temporaryValue = arr[rootIndex];
            arr[rootIndex] = arr[largestValueIndex];
            arr[largestValueIndex] = temporaryValue;

            // Recursively heapify the affected sub-tree
            heapify(arr, heapSize, largestValueIndex);
        }
    }

    static void heapSort(int[] arr) {      

        // Build heap (rearrange array)
        for (int buildHeapIndex = arr.length / 2 - 1; buildHeapIndex >= 0; buildHeapIndex--) {                    
            heapify(arr, arr.length, buildHeapIndex);
        }

        // One by one extract an element from heap
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // Move current root to end
            int temporaryValue = arr[0]; 
            arr[0] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temporaryValue;

            // Call max heapify on the reduced heap
            heapify(arr, lastUnsortedIndex, 0);
        }
    }

    // Driver's code
    public static void main(String args[]) {
        int[] arr = {9, 4, 3, 8, 10, 2, 5, 6, 7, 34}; 
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Sorted array is ");
        System.out.println(Arrays.toString(arr));
    }
}
