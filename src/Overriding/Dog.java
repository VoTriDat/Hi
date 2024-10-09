package Overriding;

public class Dog extends Animals{
    private String color;

    public Dog(String name, int numbers) {
        super(name, numbers);
    }

    public String getType() {
        return color;
    }

    public void setType(String type) {
        this.color = type;
    }

    public Dog(String name, int numbers, String type) {
        super(name, numbers);
        this.color = type;
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
}
