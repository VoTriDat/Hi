package Overriding;

public class Run {
    public static void main(String[] args) {
        Animals a = new Animals("Dog", 100);
        Dog d = new Dog("Corgi", 10,"white");
        MiniDog m = new MiniDog("corgi", 1, "white");
//        m.eat();
        Pen p = new Pen("ThienLong", 10);
        p.eat();
        p.drink();
    }
}
