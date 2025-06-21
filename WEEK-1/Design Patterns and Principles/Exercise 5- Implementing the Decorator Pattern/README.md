# Decorator Pattern – Notification System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 5: Implementing the Decorator Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

We need to build a notification system where notifications can be sent through multiple channels like Email, SMS, and Slack. The Decorator Pattern is used to dynamically add these features at runtime.

---

## What is the Decorator Pattern?

The Decorator Pattern allows behavior to be added to an individual object dynamically without affecting the behavior of other objects from the same class.

---

## Implementation Summary

- `Notifier`: Base interface with the method `send()`
- `EmailNotifier`: Concrete component that sends email
- `NotifierDecorator`: Abstract class that implements `Notifier` and holds a reference
- `SMSNotifierDecorator`, `SlackNotifierDecorator`: Add additional behavior
- `Main`: Demonstrates sending a message using all decorators
