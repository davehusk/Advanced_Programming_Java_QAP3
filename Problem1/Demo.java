// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create objects of each class
        Person bob = new Person("Coach Bob", 27, "M");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");

        // Print the objects using toString()
        System.out.println(bob);
        System.out.println(lynne);
        System.out.println(mrJava);
        System.out.println(ima);

        // Test additional functionality
        System.out.println("\nAdditional Functionality:");
        System.out.println("Is Lynne on the honor roll? " + lynne.isHonorRoll());
        System.out.println("Mr. Java's monthly salary: $" + mrJava.getMonthlySalary());
    }
}