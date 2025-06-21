# E-commerce Platform Search Function

**Week 1 – Java FSE Deep Skilling**  
**Exercise 2: E-commerce Platform Search Function**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Understanding Asymptotic Notation

Big O notation is used to describe how the performance of an algorithm changes with the size of the input. It helps us understand which algorithm will work better as data grows.

- Best Case: When the desired element is found immediately.
- Average Case: When the element is found somewhere in the middle.
- Worst Case: When the element is not found or is the last item.

---

## 2. Setup

I created a `Product` class with attributes:  
- `productId` – unique identifier  
- `productName` – used for searching  
- `category` – product category  

These are stored in arrays to simulate a real product list.

---

## 3. Implementation

Two search algorithms were implemented:

- **Linear Search:** Goes through each product in the array one by one.
- **Binary Search:** Works on a sorted array and divides the search space in half each time for faster searching.

User inputs the product name, and both searches are performed.

---

## 4. Time Complexity Analysis

- **Linear Search:**  
  - Best case: O(1)  
  - Worst case: O(n)  
- **Binary Search:**  
  - Best case: O(1)  
  - Worst case: O(log n)

Binary search is faster but only works on sorted data. For small or unsorted data, linear search is simpler.

---

## 5. Which is Better?

***Binary search*** is better for performance, especially with large datasets. However, it requires the list to be sorted. Linear search is easier to implement and works for small or unsorted lists.

