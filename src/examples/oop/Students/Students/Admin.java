package examples.oop.Students.Students;

public abstract class Admin extends User {
    public Admin (String phone) {
        super(phone);
    }
public Admin (String name, String phone) {
    super(name, phone);
}
}
