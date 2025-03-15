// Student.java
public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Call the superclass constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter and Setter methods
    public String getIdNum() { return myIdNum; }
    public void setIdNum(String idNum) { myIdNum = idNum; }

    public double getGPA() { return myGPA; }
    public void setGPA(double gpa) { myGPA = gpa; }

    // toString method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}