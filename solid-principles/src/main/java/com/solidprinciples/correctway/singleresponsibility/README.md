# Single Responsibility Principle

The Single Responsibility Principle (SRP) is a principle in object-oriented design that states:

1. **A class should have only one reason to change, meaning that it should have only one job or responsibility.**

In this context, the SRP is demonstrated through the following classes:

## `Employee` Class

### `Employee`

- **Responsibility:** Represents an employee with attributes `name`, `email`, `salary`.
- **Methods:** `getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`, `getSalary()`, `setSalary(double salary)`.

## `SalaryCalculator` Class

### `SalaryCalculator`

- **Responsibility:** Calculates the salary for an employee.
- **Method:** `calculatePay(Employee employee)`: Computes the salary of the given employee, applying a 10% increase (`employee.getSalary() * 1.1`).

## Explanation

The SRP is adhered to in this example by separating the responsibilities of representing an employee (`Employee` class) and calculating their salary (`SalaryCalculator` class). The `Employee` class is responsible for encapsulating employee data and providing methods to access and modify this data. Meanwhile, the `SalaryCalculator` class is responsible for the specific task of computing the salary, ensuring that each class has a single reason to change.

This design approach improves code maintainability, readability, and extensibility by avoiding bloating classes with unrelated responsibilities. Each class is focused and cohesive, making it easier to modify, extend, and test independently.
