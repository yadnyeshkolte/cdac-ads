package sort;
import java.util.Random;
import java.util.Arrays;
public class HeapSort {
    public static void main(String[] args){
        Random ra = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = ra.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
