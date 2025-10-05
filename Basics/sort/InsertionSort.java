package sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cvalue = arr[i];
            int pindex = i - 1;
            while (pindex >= 0 && arr[pindex] > cvalue) {
                arr[pindex + 1] = arr[pindex];
                pindex--;
            }
            arr[pindex + 1] = cvalue;
        }
    }
}
