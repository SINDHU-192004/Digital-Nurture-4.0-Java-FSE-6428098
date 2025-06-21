# Singleton Pattern Example – Logger Utility

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 1: Implementing the Singleton Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Problem Statement

We need a logging utility in our application that should have **only one instance** across the entire app. This ensures that all logs are consistent and handled by the same object.

This is a common real-world use case for the **Singleton Design Pattern**.

---

## 2. What is Singleton Pattern?

The Singleton Pattern ensures that:
- Only **one object** of the class is ever created
- It provides a **global point of access** to that object

This is useful for logging, configuration, database connections, etc.

---

## 3. Implementation Details

- A class named `Logger` is created
- It has:
  - A **private static variable** to hold the single instance
  - A **private constructor** to prevent direct object creation
  - A **public static method** (`getInstance()`) to return the same instance every time
- A `log()` method is used to simulate log output

---

## 4. Test Class

The `Main` class creates two references to the logger using `Logger.getInstance()` and checks if they point to the same object.
