# Task Management System

**Week 1 – Java FSE Deep Skilling**  
**Exercise 5: Task Management System**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Understanding Linked Lists

A linked list is a linear data structure where each element (called a node) points to the next. Unlike arrays, linked lists do not use contiguous memory. This allows easy insertion and deletion of elements.

- **Singly Linked List:** Each node points only to the next node.
- **Doubly Linked List:** Each node points to both the next and previous nodes, allowing backward traversal as well.

For this exercise, a **singly linked list** was used.

---

## 2. Setup

I created a `Task` class with:
- `taskId` – unique identifier for the task
- `taskName` – the name/description of the task
- `status` – task status (e.g., Pending, Done)

A linked list is built by chaining `Task` nodes using the `next` pointer.

---

## 3. Implementation

The system includes methods to:
- **Add Task** – Adds a task to the end of the list
- **Search Task** – Finds a task by its ID
- **Display Tasks** – Traverses and prints all tasks
- **Delete Task** – Removes a task by ID

All operations are handled via console interaction.

---

## 4. Time Complexity

- **Add Task:** O(n) – Traverse to end of list
- **Search Task:** O(n) – Linear search
- **Display Tasks:** O(n) – Traverse entire list
- **Delete Task:** O(n) – Search and unlink

---

## 5. Why Linked Lists?

***Linked lists*** are better than arrays when:
- You need to **frequently insert or delete** elements
- You don’t know the size of the data in advance
- You want to **avoid shifting elements** like in arrays

However, searching is slower compared to arrays with indexing.


