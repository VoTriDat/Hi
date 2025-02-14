package SORT;

import java.util.Arrays;

public class MERGESORT {
    public static void main(String[] args) {
        int arr[] = {8, 5, 9, 1, 6, 7};
        merge_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void merge_Sort(int[] arr, int left, int right) {

        if (left < right) {

            int mid =  (right + left) / 2; /*
                th1: mid = (5+0)/2 = 2
                th2: mid = (2+0)/2 = 1
                th3: mid = (1+0) / 2 = 0
            */
            //System.out.println("Merge_sort 0: mid = " + mid + " left = " + left + " right: "+ right);

            merge_Sort(arr, left, mid);
            //System.out.println("Merge_sort 1: mid = " + mid + " left = " + left + " right: "+ right);
            /*
            th1 mid = 2: merge_Sort(arr, 0, 2)
            th2: mid = 1: merge_sort(arr, 0, 1)
            th3 mid = 0:  merge_sort(arr, 0, 0)

             */

            merge_Sort(arr, mid + 1, right);
            //System.out.println("Merge_sort 2: mid = " + mid + " left = " + left + " right: "+ right);

            /*
             merge_sort(arr, 1, 1)

             */

            merge(arr, left, mid, right);
            //System.out.println("merge: "+ mid);
                /*
                merge(arr, 0, 0, 1)
                 */

        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        //System.out.println("LEFT: "+ left + " RIGHT: "+ right+" MID: "+mid);
        int n1 = mid - left + 1;
        int n2 = right - mid;
       // System.out.println(Arrays.toString(arr));
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        //System.out.println("Left arrays: " + Arrays.toString(leftArray));
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
       // System.out.println("Right arrays: " + Arrays.toString(rightArray));

        int i = 0, j = 0, k = left;
        // i = 0 j = 0 k = 0
        /*
        leftArray = 5 8 9
        rightARR = 1 6 7
        arr[k = 0] = 1
        j = 1 i = 0 k = 1
        arr [k = 1] = 5
        i = 1 j = 1 k = 2
        arr[k = 2] = 6
        i = 1 j = 2 k = 3
        arr[k = 3] = 7
        i = 1 j = 3 k = 4
        arr = [1, 5, 6, 7]
         */
        while (i < n1 && j < n2) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        System.out.println("Test 1: " + Arrays.toString(arr));
        /*
        1 5 6 7 6 7
        i = 1 j = 3 k = 4
        ar[k = 4 ] = 8
        1 5 6 7 8 7
        i = 2 j = 3 k = 5
        arr[k = 5] = 9
        1 5 6 7 8 9
        i = 3 j = 3 k = 6

         */
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        //System.out.println(mid);
       // System.out.println("Test n1: " + Arrays.toString(arr));

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        //System.out.println("Test n2: " + Arrays.toString(arr));
        System.out.println();
    }
}
