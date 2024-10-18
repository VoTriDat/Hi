package DSA;
class search{
    static boolean check(int [] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
}
public class linearSearch {
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 4, 9, 10};
        int x= 5;
        if(search.check(a, x)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
