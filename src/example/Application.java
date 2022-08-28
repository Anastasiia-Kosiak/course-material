package example;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Lucky");
        //cat.greets();
        System.out.println(cat.toString());
        Dog dog = new Dog("Rex");
        dog.greets();
        BigDog bigDog = new BigDog("Big Dog");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(bigDog);
    }
}
