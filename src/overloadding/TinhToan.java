package overloadding;

public class TinhToan {
    public int tinhDienTichHinhChuNhat(int x, int y){
        return x*y;
    }
    public double tinhDienTichHinhTron(int r){
        return r*r*Math.PI;
    }
    public int tinhDienTichMotDiem(){
       return 1;
    }

    public static void main(String[] args) {
        int cDai = 5;
        int cRong = 2;
        int banKinh = 4;
        TinhToan t = new TinhToan();
        System.out.println(t.tinhDienTichHinhChuNhat(cDai, cRong));
        System.out.println(t.tinhDienTichHinhTron(banKinh));
        System.out.println(t.tinhDienTichMotDiem());
    }
}
