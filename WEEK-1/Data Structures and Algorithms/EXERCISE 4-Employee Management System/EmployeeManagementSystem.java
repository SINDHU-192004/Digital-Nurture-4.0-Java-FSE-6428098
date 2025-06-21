// Week 1 Assignment – Exercise 4: Employee Management System
// Submitted by: SINDHU.T | Superset ID: 6428098

import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    static final int MAX = 100;
    static Employee[] employees = new Employee[MAX];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void addEmployee() {
        if (count >= MAX) {
            System.out.println(" Cannot add more employees. Array is full.");
            return;
        }
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Position: ");
        String position = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, position, salary);
        System.out.println(" Employee added successfully.");
    }

    public static void searchEmployee() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                employees[i].display();
                return;
            }
        }
        System.out.println(" Employee not found.");
    }

    public static void displayEmployees() {
        if (count == 0) {
            System.out.println(" No employee records found.");
            return;
        }
        System.out.println(" Employee List:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println(" Employee deleted.");
                return;
            }
        }
        System.out.println(" Employee not found.");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: searchEmployee(); break;
                case 3: displayEmployees(); break;
                case 4: deleteEmployee(); break;
                case 5: System.out.println(" Exiting..."); break;
                default: System.out.println(" Invalid choice.");
            }
        } while (choice != 5);
    }
}
