// This class represents a single student in the system
// It stores the basic information about a student, including
// ID, name, age, and department
public class Student {

    private int id;
// Unique identifier for the student
    private String name;
    private int age;
    private String department;
 // Constructor to create a new student object
    public Student(int id, String name,
            int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }
// Getters for each field
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
// Method to display student information as a string
    @Override
    public String toString() {
        return "ID: " + id + ", Name:" + name +
               ", Age: " + age +
               ", Department: " +
    department;
    }
    public static void main(String[] args) {
        Student s = new Student(1,"Ali", 20, "CS");
        System.out.println(s);
    }
}
