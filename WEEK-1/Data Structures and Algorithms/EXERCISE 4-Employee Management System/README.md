# Employee Management System

**Week 1 – Java FSE Deep Skilling**  
**Exercise 4: Employee Management System**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Array Representation

In Java, arrays are stored in **contiguous memory locations**. Each element can be accessed directly using an index, which makes operations like traversal and search very efficient in small datasets.

Arrays are fixed in size and are useful when the size of the data is known in advance. They provide fast access and are simple to use.

---

## 2. Setup

I created an `Employee` class with:
- `employeeId` – unique ID for the employee
- `name` – employee name
- `position` – job role or title
- `salary` – employee’s salary

An array of size 100 is used to store employee records.

---

## 3. Implementation

The program provides options to:

- **Add Employee** – Adds a new employee to the array
- **Search Employee** – Finds an employee by ID
- **Display All Employees** – Lists all current records
- **Delete Employee** – Deletes an employee by shifting array elements

User input is handled through the console, and operations are performed accordingly.

---

## 4. Time Complexity Analysis

- **Add:** O(1) – Adds at the end of the array
- **Search:** O(n) – Linear search for ID
- **Traverse:** O(n) – One loop through the array
- **Delete:** O(n) – May need to shift all following elements

---

## 5. Limitations of Arrays

- Fixed size: Once full, you can’t add more elements.
- Insertion and deletion may require shifting elements, which takes time.
- Searching is slow compared to more advanced structures like `HashMap`.

Arrays are best when data size is small and operations are simple. For large or dynamic data, we should use structures like `ArrayList` or `HashMap`.
