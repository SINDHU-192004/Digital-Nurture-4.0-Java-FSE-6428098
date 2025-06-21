// TaskManagementSystem.java
// Week 1 Assignment – Exercise 5: Task Management System
// Submitted by: SINDHU.T | Superset ID: 6428098

import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status);
    }
}

public class TaskManagementSystem {
    static Task head = null;
    static Scanner sc = new Scanner(System.in);

    public static void addTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
        System.out.println(" Task added successfully.");
    }

    public static void displayTasks() {
        if (head == null) {
            System.out.println(" No tasks to display.");
            return;
        }
        System.out.println(" Task List:");
        Task temp = head;
        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }

    public static void searchTask() {
        System.out.print("Enter Task ID to search: ");
        int id = sc.nextInt();
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                temp.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Task not found.");
    }

    public static void deleteTask() {
        System.out.print("Enter Task ID to delete: ");
        int id = sc.nextInt();

        if (head == null) {
            System.out.println(" Task list is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println(" Task deleted.");
            return;
        }

        Task prev = head;
        Task current = head.next;

        while (current != null) {
            if (current.taskId == id) {
                prev.next = current.next;
                System.out.println(" Task deleted.");
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println(" Task not found.");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n Task Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addTask(); break;
                case 2: searchTask(); break;
                case 3: displayTasks(); break;
                case 4: deleteTask(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println(" Invalid choice.");
            }
        } while (choice != 5);
    }
}
