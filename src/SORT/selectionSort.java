package SORT;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] a = {1,4,2,5,8,7,5,10,-5};
        int i, j, key;
        for( i = 0; i < a.length - 1; ++i){
            key = i;
            for(j = i+1; j < a.length; ++j){
                if(a[j] < a[key]){
                    int tmp = a[j];
                    a[j] = a[key];
                    a[key] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
