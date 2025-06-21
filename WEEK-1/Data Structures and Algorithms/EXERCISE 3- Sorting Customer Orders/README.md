# Sorting Customer Orders

**Week 1 – Java FSE Deep Skilling**  
**Exercise 3: Sorting Customer Orders**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Understanding Sorting Algorithms

Sorting algorithms are used to arrange data in a particular order. Here are some common ones:

- **Bubble Sort** – Compares each pair of adjacent elements and swaps them if needed. It is simple but slow for large inputs.
- **Insertion Sort** – Builds the sorted array one element at a time. Suitable for small data.
- **Quick Sort** – A divide-and-conquer algorithm that selects a pivot and sorts elements around it. It’s fast and widely used.
- **Merge Sort** – Divides the array, sorts them individually, and then merges them. Very stable and used in parallel systems.

---

## 2. Setup

I created an `Order` class with:
- `orderId` – to identify each order
- `customerName` – name of the customer
- `totalPrice` – the price to be used for sorting

Orders are stored in an array to apply sorting algorithms.

---

## 3. Implementation

I implemented two sorting algorithms:

- **Bubble Sort:** Simple comparison-based sorting. It compares each pair of adjacent elements and swaps if needed.
- **Quick Sort:** Uses a pivot and places smaller elements to its left and larger ones to the right, recursively sorting the subarrays.

Both versions print the sorted orders to the console.

---

## 4. Time Complexity

**Bubble Sort:**
- Best Case: O(n)
- Average/Worst Case: O(n²)

**Quick Sort:**
- Best/Average Case: O(n log n)
- Worst Case: O(n²) (rare, with poor pivot choice)

---

## 5. Why Quick Sort is Preferred

***Quick Sort*** is generally faster than Bubble Sort, especially for larger datasets. It reduces the number of comparisons and swaps and is efficient due to its divide-and-conquer approach. That’s why it’s widely used in real-world applications like databases, file systems, and large-scale data sorting.

