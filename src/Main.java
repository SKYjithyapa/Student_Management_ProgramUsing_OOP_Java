import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        boolean exit = false;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add another student");
            System.out.println("2. Print student data");
            System.out.println("3. Close");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Input data for a new student
                    System.out.println("Enter details for the new student:");
                    System.out.print("Student ID: ");
                    int studentID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    // Input data for a new module
                    System.out.println("Enter details for the new module:");
                    System.out.print("Module ID: ");
                    int moduleID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Module Name: ");
                    String moduleName = scanner.nextLine();
                    System.out.print("Lecture Name: ");
                    String lectureName = scanner.nextLine();

                    // Creating a Module and Student, then adding to the ArrayList
                    Module module = new Module(moduleID, moduleName, lectureName);
                    Student student = new Student(studentID, firstName, lastName, age, module);
                    students.add(student);
                    break;

                case 2:
                    // Displaying details for all students in the ArrayList
                    for (Student s : students) {
                        s.StudentDetails();
                        System.out.println("--------------");
                    }
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        } while (!exit);

        // Close the scanner
        scanner.close();
    }
}
