// LibraryManagementSystem.java
// Week 1 Assignment – Exercise 6: Library Management System
// Submitted by: SINDHU.T | Superset ID: 6428098

import java.util.Arrays;
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
    }
}

public class LibraryManagementSystem {
    static Scanner sc = new Scanner(System.in);

    public static void linearSearch(Book[] books, String title) {
        System.out.println("\n Linear Search Result:");
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void binarySearch(Book[] books, String title) {
        System.out.println("\n Binary Search Result:");
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) {
                books[mid].display();
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        Book[] bookArray = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "Clean Code", "Robert C. Martin"),
            new Book(3, "Atomic Habits", "James Clear"),
            new Book(4, "1984", "George Orwell"),
            new Book(5, "The Pragmatic Programmer", "Andy Hunt")
        };

        // Sorted array by title for binary search
        Book[] sortedBooks = bookArray.clone();
        Arrays.sort(sortedBooks, (a, b) -> a.title.compareToIgnoreCase(b.title));

        System.out.print("Enter book title to search: ");
        String searchTitle = sc.nextLine();

        linearSearch(bookArray, searchTitle);
        binarySearch(sortedBooks, searchTitle);
    }
}
