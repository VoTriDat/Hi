package Inheritor;

public class conNguoi {
    private int namSinh;
    private String hoVaTen;

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void an(){
        System.out.println("eat");
    }

    public conNguoi(int namSinh, String hoVaTen) {
        this.namSinh = namSinh;
        this.hoVaTen = hoVaTen;
    }
}


