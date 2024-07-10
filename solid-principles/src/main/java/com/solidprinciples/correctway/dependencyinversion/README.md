# Dependency Inversion Principle

The Dependency Inversion Principle (DIP) is a fundamental concept in SOLID principles that states:

1. **High-level modules should not depend on low-level modules. Both should depend on abstractions.**
2. **Abstractions should not depend on details. Details should depend on abstractions.**

In this context, the DIP is implemented to decouple high-level modules from low-level modules by using interfaces. Here’s a brief explanation of how it’s applied:

## Classes and Interfaces

### Interfaces

- **DatabaseService:** An abstraction for database operations.
- **EmailService:** An abstraction for email operations.

### Implementations

- **DatabaseServiceImpl:** Implements `DatabaseService` to handle database operations.
- **EmailServiceImpl:** Implements `EmailService` to handle email operations.

### High-Level Module

- **EmployeeService:** A high-level class that depends on the abstractions `EmailService` and `DatabaseService` rather than their concrete implementations.

### Entities

- **Employee:** Represents an employee with attributes like name and email.

## Explanation

By using interfaces (`DatabaseService` and `EmailService`), `EmployeeService` does not depend on the specific implementations (`DatabaseServiceImpl` and `EmailServiceImpl`). This approach makes the `EmployeeService` class more flexible and easier to maintain or extend because the actual implementation of the database and email services can change without affecting the `EmployeeService`.
