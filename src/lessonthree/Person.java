package lessonthree;

public class Person {
    public static int objectCount;
    public int count = 0;
    private String name = "";
    private int age;

    // блок ініціалізації
    {
        count = 5;

    }

    static {
        objectCount = 10;
    }

    public Person() {
    }
    public Person(String name, int age) {
        objectCount++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void displayCount() {
        System.out.println("objects created " + objectCount);
    }
}
