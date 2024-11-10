package DSA;
import java.util.Arrays;
class bubbleSort{
    public void sort(int a []){
        for(int i = 0; i < a.length - 1; i++){
            for(int j = a.length - 1; j > i ;j--){
                if(a[j-1] > a[j]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}

public class binary_search {
    public static void main(String[] args) {
        int a [] = {6, 9, 8, 3, 5, 10, 11};
        bubbleSort b = new bubbleSort();
        b.sort(a);
        int left = 0;
        int right = a.length - 1;
        int x = 11;
        boolean check = false;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(a[mid] == x){
                check = true;
                break;
            }
            else if(a[mid] > x){
                right = mid - 1;
            }
            else if(a[mid] < x){
                left = mid + 1;
            }
        }
        if(check){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
