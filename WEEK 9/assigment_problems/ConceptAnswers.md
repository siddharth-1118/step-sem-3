# Abstraction and Interface Concept Answers

## Part B - Quiz Answers
- **Q1:** **C** — Abstraction hides implementation details and shows only essential features to the user.
- **Q2:** **C** — An abstract class in Java cannot be instantiated directly using `new`.
- **Q3:** **B** — A concrete class extending an abstract class must implement all inherited abstract methods or be declared `abstract`.
- **Q4:** **C** — Abstract methods cannot be `private` because they must be overridden by subclasses.
- **Q5:** **C** — Fields in a Java interface are implicitly `public static final`.
- **Q6:** **C** — A single Java class can implement any number of interfaces (multiple interface inheritance).
- **Q7:** **D** — Methods implemented from an interface must be declared `public` because interface methods are implicitly public.

## Part C - Concept Questions & Explanations
1. **Inheritance & Reusability**: Subclasses inherit state and behavior from a base class, reusing code while overriding specific methods for specialized functionality (e.g., `Employee` base class with `FullTimeEmployee` overriding `calculatePay()`).
2. **The 'is-a' Relationship**: Inheritance models an 'is-a' relationship (e.g., `Dog` IS-A `Animal`). Misusing inheritance for code reuse without an 'is-a' relationship creates tight coupling and invalid domain models.
3. **Method Overriding**: Allows a derived class to provide a specific implementation of a method already declared in its superclass.
4. **Runtime Polymorphism**: System resolves method calls at runtime based on the actual object type, not the reference type (dynamic dispatch).
5. **Polymorphic Collections**: Arrays or lists of a base reference type holding subclass instances, allowing uniform processing through loops.
6. **Polymorphism vs Conditional Logic**: Polymorphism replaces brittle `if-else` / `switch` type-checking loops with dynamic dispatch, adhering to the Open/Closed Principle.
7. **Extensibility**: Adding a new derived type requires zero changes to existing polymorphic iteration and calculation logic.
8. **Inherited vs Overridden Behavior**: Inherit when behavior is identical across all subclasses; override when behavior is type-specific.
9. **Drawbacks of Misusing Inheritance**: Violates LSP (Liskov Substitution Principle), bloats subclasses with irrelevant fields/methods, creates fragile superclass problems.
10. **Vehicle Rental Case Study**: Base `VehicleRental` holds common attributes (`rentalId`, `customer`, `dailyRate`), while `CarRental` and `TruckRental` override fee calculation for passenger capacity or tonnage charges.
