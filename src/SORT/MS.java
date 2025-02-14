package SORT;

import java.util.Arrays;

public class MS {

    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 9, 0, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int len = arr.length;
        if(len <= 1) return;
        int mid = len / 2;
        int [] leftArr = new int[mid];
        int [] rightArr = new int[len - mid];
        int j = 0;
        for(int i = 0; i < len; i++){
            if(i < mid){
                leftArr[i] = arr[i];
            }
            else{
                rightArr[j] = arr[i];
                j++;
            }
        }
    }
}
