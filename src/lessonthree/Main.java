package lessonthree;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();

        Professor professor = new Professor("James", 45, "Geometry");

        // дефолтний конструктор - конструктор без параметрів
        // name - null
        // age - 0
        // subject - null
        Person.displayCount();
       // professor.age = 45;
        //professor.name= " John";
        professor.setName("John");
        professor.setAge(45);
        professor.setSubject("Maths");
        professor.printProfessorInfo();
        Professor professor2 = new Professor();
        professor2.setAge(56);
        professor2.setName("Mary");
        professor2.setSubject("History");
//        System.out.println(professor.getName());
//        System.out.println(professor.getAge());
//        System.out.println(professor.getSubject());

        professor2.printProfessorInfo();
        Professor mathTeacher1 = new Professor("Ivan", 30);
        mathTeacher1.printProfessorInfo();
        Person p = new Person();
//        System.out.println(mathTeacher1.getName());
//        System.out.println(mathTeacher1.getAge());
//        System.out.println(mathTeacher1.getSubject());
        Professor mathTeacher2 = new Professor("Jane", 50);
        mathTeacher2.printProfessorInfo();
//        System.out.println(mathTeacher2.getName());
//        System.out.println(mathTeacher2.getAge());
//        System.out.println(mathTeacher2.getSubject());
        // ООП
        // 1. інкапсуляція -
        //2. поліморфізм
        // 3. наслідування
        //4. абстракція
        // клас
        //  об'єекти
        // поля
        //

        Student student1 = new Student();
        student1.setName("Oleh");
        student1.setAge(21);
        student1.setAverageGrade(4.2);
        student1.printStudentInfo();
        Student student2 = new Student("Kate", 20, 4.5);
//        System.out.println(student2.getAverageGrade());
        student2.printStudentInfo();
        Person person = new Person();

        Person person1 = new Professor();
        Person person2 = new Student();
        // person
        //

        //модифікатори доступу -
        // public - класи, поля, методи
        // default -
       Person.displayCount();
       String s = "g";
    }
}
