# Library Management System

**Week 1 – Java FSE Deep Skilling**  
**Exercise 6: Library Management System**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Understanding Search Algorithms

- **Linear Search:** Checks each element one by one. It is simple and works for unsorted data.
- **Binary Search:** Works only on sorted data. It divides the list into halves to search faster.

Binary search is more efficient for large, sorted datasets, while linear search is easier to implement and works on any dataset.

---

## 2. Setup

I created a `Book` class with:
- `bookId`: unique identifier
- `title`: used for searching
- `author`: author's name

Books are stored in an array to perform linear and binary search.

---

## 3. Implementation

- **Linear Search:** Iterates over the array and compares each book title with the input.
- **Binary Search:** Uses divide-and-conquer on a sorted array of books by title.

Both methods are implemented, and the user can input the title to be searched.

---

## 4. Time Complexity

- **Linear Search:**
  - Best Case: O(1)
  - Worst Case: O(n)

- **Binary Search:**
  - Best Case: O(1)
  - Worst Case: O(log n)

---

## 5. When to Use Each Algorithm

- Use **Linear Search** when:
  - The dataset is small
  - The data is **unsorted**
- Use **Binary Search** when:
  - The dataset is **large**
  - The data is sorted (especially alphabetically)

