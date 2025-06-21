# Proxy Pattern – Image Viewer

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 6: Implementing the Proxy Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

## Problem Statement

We are building an image viewer that loads images from a remote server. The Proxy Pattern is used to implement lazy loading and caching of images.

---

## What is the Proxy Pattern?

The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. It is especially useful for lazy initialization, logging, or controlling access to resources.

---

## Implementation Summary

- `Image`: Subject interface
- `RealImage`: The real object that loads and displays images
- `ProxyImage`: Acts as a substitute and loads `RealImage` only when needed
- `Main`: Demonstrates the use of the proxy to load and reuse images

---


