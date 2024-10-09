package Overriding;

public class MiniDog extends Dog{
    private int size;

    public MiniDog(String name, int numbers, String type) {
        super(name, numbers, type);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MiniDog(String name, int numbers, int size) {
        super(name, numbers);
        this.size = size;
    }
}
