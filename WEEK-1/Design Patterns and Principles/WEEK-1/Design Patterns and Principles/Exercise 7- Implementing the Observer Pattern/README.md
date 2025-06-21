# Observer Pattern – Stock Market Monitoring System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 7: Implementing the Observer Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

You are developing a stock monitoring app where multiple clients like mobile and web need to be notified whenever stock prices change. The Observer Pattern is ideal for this.

---

## What is the Observer Pattern?

The Observer Pattern defines a one-to-many dependency between objects so that when one object (Subject) changes state, all its dependents (Observers) are notified and updated automatically.

---

## Implementation Summary

- `Stock`: Subject interface
- `StockMarket`: Concrete subject that maintains observer list and notifies them
- `Observer`: Observer interface
- `MobileApp`, `WebApp`: Concrete observers
- `Main`: Demonstrates observer registration and notifications
