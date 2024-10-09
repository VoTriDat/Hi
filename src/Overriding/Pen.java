package Overriding;

public class Pen extends Animals{
    public Pen(String name, int numbers) {
        super(name, numbers);
    }

    @Override
    public void drink() {
//        super.drink();
        System.out.println("ydhsi");
    }

    @Override
    public void eat() {
//        super.eat();// Meat
        System.out.println("yhdsuy");
    }
}
