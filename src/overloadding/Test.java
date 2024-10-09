package overloadding;

public class Test {
        public int Tong(int x, int y){
             return  x+ y;
        }
        public double TongThapPhan(double x, double y){
            return x + y;
        }
        public int tongMang(int [] a){
            int sum = 0;
            for(int i = 0; i <= a.length - 1; ++i){
                sum += a[i];
            }
            return sum;
        }
        public int minNguyen(int x, int y){
            if(x >= y){
                return y;
            }
            else{return x;}
        }
        public double minThapPhan(double x, double y){
            if(x >= y){
                return y;
            }
            else{return x;}
        }

    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int tong = 0;
        double c = 2.1;
        double d = 3.2;
        int [] arr ={1, 2, 3, 4};
        Test t = new Test();
        System.out.println(t.Tong(a, b));
        System.out.println(t.TongThapPhan(c, d));
        System.out.println(t.tongMang(arr));
        System.out.println(t.minThapPhan(c, d));
        System.out.println( t.minNguyen(a, b));

    }



}
