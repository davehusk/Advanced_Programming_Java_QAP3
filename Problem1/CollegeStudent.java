// CollegeStudent.java
public class CollegeStudent extends Student {
    private String major; // College student's major
    private int year; // College year (1 = FROSH, 2 = SOPH, etc.)

    // Constructor to initialize CollegeStudent object
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call superclass constructor
        setYear(year); // Validate and set year
        setMajor(major); // Validate and set major
    }

    // Getter and Setter methods with input validation
    public String getMajor() { return major; }
    public void setMajor(String major) {
        if (major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("Major cannot be empty or null.");
        }
        this.major = major;
    }

    public int getYear() { return year; }
    public void setYear(int year) {
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Year must be between 1 and 4.");
        }
        this.year = year;
    }

    // toString method to display CollegeStudent details
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}