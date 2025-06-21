# Strategy Pattern – Payment System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 8: Implementing the Strategy Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

You are developing a payment system where different payment methods such as Credit Card and PayPal can be selected at runtime. The Strategy Pattern allows us to choose the appropriate payment method dynamically, promoting flexibility and maintainability.

---

## What is the Strategy Pattern?

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

---

## Implementation Summary

- `PaymentStrategy`: Interface that defines the `pay()` method.
- `CreditCardPayment`: Concrete strategy that implements payment via credit card.
- `PayPalPayment`: Concrete strategy that implements payment via PayPal.
- `PaymentContext`: Context class that holds a reference to a `PaymentStrategy`.
- `Main`: Demonstrates switching strategies at runtime and executing payments.

