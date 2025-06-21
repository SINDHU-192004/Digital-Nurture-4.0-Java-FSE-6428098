# MVC Pattern – Student Record Management System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 10: Implementing the MVC Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

You are building a student management application where details of students are maintained and updated using the MVC design pattern. MVC promotes separation of concerns for better organization and maintainability.

---

## What is the MVC Pattern?

MVC (Model-View-Controller) is a design pattern that separates application logic into three interconnected components:
- **Model**: Manages the data and logic
- **View**: Displays data to the user
- **Controller**: Acts as an interface between Model and View

---

## Implementation Summary

- `Student`: Model class with student data and getters/setters
- `StudentView`: Responsible for printing student details
- `StudentController`: Handles data updates and manages flow
- `Main`: Demonstrates updating the model and refreshing the view
