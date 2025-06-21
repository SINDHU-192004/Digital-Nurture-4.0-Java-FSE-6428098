# Factory Method Pattern – Document Management System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 2: Implementing the Factory Method Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

##  Problem Statement

In a document management system, we need to support the creation of various document types like Word, PDF, and Excel. Using the **Factory Method Pattern**, we can encapsulate the creation logic and ensure that the system is scalable, maintainable, and follows object-oriented principles.

---

##  What is the Factory Method Pattern?

The **Factory Method Pattern** allows subclasses to decide which class to instantiate.  
Instead of creating objects directly using `new`, the creation logic is **delegated to factory classes**, providing **flexibility and abstraction**.

---

## 🏗️ Implementation Details

### 1. Interface (`IDocument`)
- Declares a method `open()` that every document type must implement.

### 2. Concrete Classes
- `WordDocument`, `PdfDocument`, `ExcelDocument`
- Each implements `IDocument` and provides its own `open()` behavior

### 3. Abstract Factory (`DocumentFactory`)
- Contains the abstract method `createDocument()`

### 4. Concrete Factories
- `WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory`
- Each overrides `createDocument()` to return the correct type

### 5. Test Class (`Main`)
- Demonstrates the use of each factory to create and open documents

