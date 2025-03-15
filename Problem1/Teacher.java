// Teacher.java
public class Teacher extends Person {
    private String subject; // Subject taught by the teacher
    private double salary; // Teacher's annual salary

    // Constructor to initialize Teacher object
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call superclass constructor
        setSubject(subject); // Validate and set subject
        setSalary(salary); // Validate and set salary
    }

    // Getter and Setter methods with input validation
    public String getSubject() { return subject; }
    public void setSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject cannot be empty or null.");
        }
        this.subject = subject;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    // Additional method to calculate monthly salary
    public double getMonthlySalary() {
        return salary / 12;
    }

    // toString method to display Teacher details
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
    }
}