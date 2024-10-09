package Overriding;

public class Animals {
    private String name;
    private int numbers;

    public String getName() {
        return name;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Animals(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }
    public void drink(){
        System.out.println("Water");
    }
    public void eat(){
        System.out.println("Meat");
    }
}
