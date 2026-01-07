import java.util.ArrayList;
// This class manages a collection of students
// It is responsible for adding, storing, and displaying students
public class StudentManager {
    private ArrayList<Student> studentList;
  // Constructor initializes the student list
    public StudentManager() {
        studentList = new ArrayList<>();
    }

    // Add a student
    public void registerStudent(Student student) {
        studentList.add(student);
    }

    // Remove a student by ID
    public boolean deleteStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                return true;
            }
        }
        return false; // not found
    }

    // Search a student by ID
    public Student findStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null; // not found
    }

    // Display all students
    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}