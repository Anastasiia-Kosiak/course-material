package lessonthree;

public class Student extends Person {
    private double averageGrade;

    public Student() {

    }

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }


    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void printStudentInfo() {
        System.out.println(getName() + " has average grade " + this.averageGrade);
    }
}
