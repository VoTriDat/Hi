package SORT;


import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {

        int  arr [] = {3, 2, 5, 3, 9, 0, 1};
        quick_Sort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick_Sort(int[] arr, int low, int high) {
        if(low < high){
            int pi = quick_sort(arr, low, high);
            quick_Sort(arr, low, pi - 1);
            quick_Sort(arr, pi + 1, high);

        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    private static int quick_sort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i + 1;
    }
}
