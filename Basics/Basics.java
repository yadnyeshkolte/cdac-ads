import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Basics {
    public static void main(String[] args){
        //Random ra = new Random();
        int[] arr = {20, 10, 1, 2, 17, 16, 1, 5, 25, 11};
        //for(int i=0;i<arr.length;i++){
           // arr[i] = ra.nextInt(0, 30);
        //}
        //System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            trioSort(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            trioSort(arr, i, 0);
        }
    }
    public static void trioSort(int[] arr, int n, int i){
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]>arr[max]){
            max = left;
        }
        if(right<n && arr[right]>arr[max]){
            max = right;
        }
        if(max!=i){
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            trioSort(arr, n, max);
        }

    }
}
