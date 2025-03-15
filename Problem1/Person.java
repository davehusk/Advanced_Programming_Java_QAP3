// Person.java
public class Person {
    protected String myName; // Name of the person
    protected int myAge; // Age of the person
    protected String myGender; // Gender of the person ("M" or "F")

    // Constructor to initialize Person object
    public Person(String name, int age, String gender) {
        setName(name); // Validate and set name
        setAge(age); // Validate and set age
        setGender(gender); // Validate and set gender
    }

    // Getter and Setter methods with input validation
    public String getName() { return myName; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }
        this.myName = name;
    }

    public int getAge() { return myAge; }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.myAge = age;
    }

    public String getGender() { return myGender; }
    public void setGender(String gender) {
        if (!gender.equals("M") && !gender.equals("F")) {
            throw new IllegalArgumentException("Gender must be 'M' or 'F'.");
        }
        this.myGender = gender;
    }

    // toString method to display Person details
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}