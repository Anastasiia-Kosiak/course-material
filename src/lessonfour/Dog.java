package lessonfour;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public Dog() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void displayColor() {
        System.out.println("gray");
    }
}
