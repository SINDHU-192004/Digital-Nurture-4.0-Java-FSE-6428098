# Adapter Pattern – Payment Processing System

**Java FSE Deep Skilling – Design Patterns**  
**Exercise 4: Implementing the Adapter Pattern**  
**Submitted by:** SINDHU.T  
**Superset ID:** 6428098

---

##  Problem Statement

You are building a payment system that must support multiple third-party gateways (e.g., Stripe, PayPal). Since each gateway has a different interface, we use the **Adapter Pattern** to provide a unified interface (`PaymentProcessor`).

---

##  What is the Adapter Pattern?

The Adapter Pattern converts the interface of a class into another interface that clients expect.  
It allows incompatible interfaces to work together without modifying existing code.

---

## Implementation Summary

- `PaymentProcessor` – Target interface used by our system
- `StripePaymentGateway`, `PayPalPaymentGateway` – Adaptees with different methods
- `StripeAdapter`, `PayPalAdapter` – Adapters that convert their respective gateway methods to `processPayment()`
- `Main` – Demonstrates how both gateways are used under a single interface

---

##  Sample Output

```
 Processing payments via unified interface:
 Stripe processed payment of $2500.0
 PayPal processed payment of $1450.5
```

---

## Benefits of Adapter Pattern

- Decouples system from third-party libraries
- Promotes reusability and scalability
- Easy to extend for new gateways without affecting existing code

