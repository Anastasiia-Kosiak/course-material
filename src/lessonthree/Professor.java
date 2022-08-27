package lessonthree;

// public
// private
//default - немає ключового слова
//protected
public class Professor extends Person {
    // поля
    private String subject; // предмет

    public Professor(){

    }

    public Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Professor(String name, int age) {
        super(name, age);
    }

//    public Professor(String name) {
//        this.name = name;
//
//    }

//    public Professor(String name, int age) {
//        this.subject = "Maths";
//        this.age = age;
//        this.name = name;
//    }

    // методи (функції)
    // сетери

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Subject - ім'я - вік - предметр
    public void printProfessorInfo() {
        displaySubject();
        System.out.println("Subject is " + this.subject + ", name is " + this.getName());
    }

    private void displaySubject() {
        System.out.println(this.subject);
    }
}
