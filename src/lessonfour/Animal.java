package lessonfour;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public void sleep() {
        System.out.println("sleep");
    }

    public abstract void makeSound();

    public abstract void displayColor();
}
