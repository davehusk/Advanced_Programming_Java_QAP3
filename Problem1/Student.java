// Student.java
public class Student extends Person {
    protected String myIdNum; // Student ID number
    protected double myGPA; // Student's GPA

    // Constructor to initialize Student object
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Call superclass constructor
        setIdNum(idNum); // Validate and set ID
        setGPA(gpa); // Validate and set GPA
    }

    // Getter and Setter methods with input validation
    public String getIdNum() { return myIdNum; }
    public void setIdNum(String idNum) {
        if (idNum == null || idNum.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be empty or null.");
        }
        this.myIdNum = idNum;
    }

    public double getGPA() { return myGPA; }
    public void setGPA(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
        this.myGPA = gpa;
    }

    // toString method to display Student details
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }

    // Additional method to check if the student is on the honor roll
    public boolean isHonorRoll() {
        return myGPA >= 3.5;
    }
}