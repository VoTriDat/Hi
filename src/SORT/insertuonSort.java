package SORT;

import java.util.Arrays;

public class insertuonSort {
    public static void main(String[] args) {
        int [] a = {3, 6, 2, 1, 5};
        System.out.println(Arrays.toString(a));
        int i, j, key;
        for( i = 1; i < a.length ; ++i){
            key = a[i];
            j = i -1;
            while(0 <= j && key < a[j]){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = key;
        }
        for(int k = 0; k < a.length; ++k){
            System.out.print(a[k]+" ");
        }
    }
}
