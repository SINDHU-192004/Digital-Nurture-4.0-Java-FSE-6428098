# Command Pattern – Home Automation System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 9: Implementing the Command Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

You are building a home automation system where commands can be issued to turn devices on or off. The Command Pattern helps encapsulate these requests as objects, allowing flexible command execution.

---

## What is the Command Pattern?

The Command Pattern encapsulates a request as an object, thereby allowing users to parameterize clients with queues, requests, and operations.

---

## Implementation Summary

- `Command`: Interface with `execute()` method
- `Light`: Receiver class with `turnOn()` and `turnOff()` methods
- `LightOnCommand`, `LightOffCommand`: Concrete command classes
- `RemoteControl`: Invoker class that triggers commands
- `Main`: Demonstrates turning a light on and off using the remote
