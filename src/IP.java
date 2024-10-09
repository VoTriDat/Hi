import java.util.Scanner;
public class IP {
public int[] taoMang(int n){
    Scanner s = new Scanner(System.in);
    int [] a = new int[n];
    for(int i = 0; i < n; i++){
        System.out.print("a[" + i + "]= ");
        a[i] = s.nextInt();
    }
    return a;
}
public void inMang(int[] a, int n){
    for(int i = 0; i < n; i++){
        System.out.print(a[i] + " ");
    }
}
public int[] xoaPhanTu(int[] a, int n, int x){
    int dem = 0;
    for(int i = 0; i < n; i++){
        if(a[i] != x){
            dem += 1;
        }
    }
    int[] newArrays = new int[dem];
    int index = 0;
    for(int j = 0; j < n; j++){
        if(a[j] != x){
            newArrays[index++] = a[j];
        }
    }
    return newArrays;
}
    public static void main(String[] args) {
        System.out.println("NHAP SO LUONG PHAN TU: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        IP I = new IP();
        int[] a = I.taoMang(n);
        System.out.println("MANG BAN DAU ");
        I.inMang(a, n);
        System.out.println();
        System.out.print("NHAP PHAN TU BAN MUON XOA: ");
        int x = s.nextInt();
        a = I.xoaPhanTu(a, n ,x);
        System.out.println("MANG LUC SAU ");
        I.inMang(a, n);
    }

}
