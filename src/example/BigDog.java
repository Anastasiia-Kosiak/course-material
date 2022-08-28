package example;


public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog dog) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog dog) {
        System.out.println("Woooooooooooooooooow");
    }

}
