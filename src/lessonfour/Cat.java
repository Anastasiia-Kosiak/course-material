package lessonfour;

import lessonthree.Person;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Meouw");
    }

    @Override
    public void displayColor() {
        System.out.println("black");
    }

//    public Person displayInfo(int a) {
//        return "hello";
//
//        //System.out.println("hello");
//    }

//    public void displayInfo(int a) {
//        System.out.println(a);
//    }
}
