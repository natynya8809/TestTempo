package examples.oop.Students.Students;

public class Student extends User {
    private int strikes;

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public Student(String phone) {
        super(phone);
    }

    public Student(String name, String phone) {
        super(name, phone);
    }
}
