package lessonfour;

import lessonthree.Person;

public class App {
    public static void main(String[] args) {
        var num = 5;
        var s = "String";
        var l = 45.6;
        // Java 9+ - var
        var person = new Person();
        int number =5;
        // heap - купа
//
        Person p1 = new Person();
        p1.setAge(20);
        System.out.println(p1.getAge());
//        p1.setName("Name1");
//        System.out.println(Person.objectCount);
//        Person p2 = p1;
//        System.out.println(p2.getName());
//        // object - person
//
//        p2.setName("Name2");
//        System.out.println(p1.getName());


        // immutable - незмінювані
//
//        int x = 5;
//        int y = x;
//        y = 10;
//        System.out.println(x);

//        String str = "hello";
//        String str2 = str.toUpperCase();
        // str2 = "hello" -> toUpper case
        // HELLO
//        System.out.println(str);
//        System.out.println(str2);
        // instantiate - стоврити екземпляр класу
//        Animal animal = new Animal();

        Cat cat = new Cat("Lucky");
        cat.sleep();
        cat.makeSound();
        cat.displayColor();

        Animal dog = new Dog("Rex");
        dog.sleep();
        dog.makeSound();
        dog.displayColor();
        Dog dog2 = new Dog();

//        String res = cat.displayInfo(3);
//        cat.displayInfo(3);
//        System.out.println(res);
    }
}
