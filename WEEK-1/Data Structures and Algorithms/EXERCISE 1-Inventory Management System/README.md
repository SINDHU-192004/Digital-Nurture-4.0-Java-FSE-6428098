# Inventory Management System

**Week 1 – Java FSE Deep Skilling**  
**Exercise 1: Inventory Management System**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## 1. Problem Understanding

This project is about building a basic inventory system for a warehouse. The goal is to manage product details and perform operations like add, update, delete, and view products efficiently.

In real-world systems, thousands of items may need to be handled. That’s why choosing the right data structure is very important to make sure these operations are fast and reliable.

---

## 2. Why HashMap is Used

I used a `HashMap` to store product data. Each product has a unique `productId`, and HashMap helps to:
- Quickly find a product using its ID.
- Easily update or delete a product.
- Handle large amounts of data without slowing down.

---

## 3. Implementation Details

I created two classes:

1. **Product** – contains the product details like ID, name, quantity, and price.

2. **InventoryManagementSystem** – manages the products using methods:
   - `addProduct()` – to add new items
   - `updateProduct()` – to update quantity or price
   - `deleteProduct()` – to remove a product
   - `displayInventory()` – to show all current products

The program uses console input to perform these actions.

---

## 4. Time Complexity

- Add Product → Fast (O(1))
- Update Product → Fast (O(1))
- Delete Product → Fast (O(1))
- Display Products → Depends on number of items (O(n))

---

## 5. How It Can Be Improved

- Use `TreeMap` if sorted product display is needed.
- Add search by product name or category using another map.
- For large inventory systems, use a database for better performance.

---

## 6. Conclusion

This assignment helped me understand how using the right data structure (like HashMap) can make a program faster and simpler. It also gave me good practice in using Java classes, methods, and handling user input.

