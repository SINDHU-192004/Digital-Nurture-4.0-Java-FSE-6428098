# Dependency Injection – Customer Management System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 11: Implementing Dependency Injection**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

In this exercise, we are building a customer management system where the service class depends on a repository to fetch customer data. We apply Dependency Injection to decouple these components.

---

## What is Dependency Injection?

Dependency Injection (DI) is a design pattern that allows a class to receive its dependencies from external sources rather than creating them internally. It promotes flexibility, testability, and adherence to the SOLID principles.

---

## Implementation Summary

- `CustomerRepository`: Interface for customer lookup
- `CustomerRepositoryImpl`: Concrete class simulating data access
- `CustomerService`: Business service class that depends on the repository
- `Main`: Demonstrates constructor-based dependency injection
