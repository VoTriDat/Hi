package SORT;

public class BUBBLE_SORT {
    public static void main(String[] args) {
        int a[] = {8, 4, 5, 2, 9, 6};
        for(int i = 0; i < a.length - 1; i++){
            for(int j = a.length-1; j>i; j--){
                if(a[j-1]>a[j]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
