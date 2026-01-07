import java.util.Scanner;

// Main entry point of the Student Management System
// Handles user interaction and connects with StudentManager
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        StudentManager manager = new StudentManager(); // Create the student manager instance

        // ---- Menu loop ----
        while(true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if(choice == 1) {
                // Adding a new student
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                Student s = new Student(id, name, age, department);
                manager.registerStudent(s);

            } else if(choice == 2) {
                // Display all students
                manager.displayAll();

            } else if(choice == 3) {
                // Exit the program
                System.out.println("Exiting system. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        // ---- End of menu loop ----

        sc.close();
    }
}

