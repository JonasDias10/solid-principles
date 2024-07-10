# Liskov Substitution Principle

The Liskov Substitution Principle (LSP) is a principle in object-oriented design that states:

1. **Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.**

In this context, the LSP is illustrated through the following classes:

## Superclass

### `Employee`

- **Fields:** `name`, `email`, `salary`
- **Methods:** `getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`, `getSalary()`, `setSalary(double salary)`, `abstract double calculatePay()`

## Subclasses

### `FullTimeEmployee`

- **Extends:** `Employee`
- **Constructor:** Initializes `name`, `email`, `salary` through superclass constructor.
- **Method Override:** Implements `calculatePay()` based on full-time salary.

### `PartTimeEmployee`

- **Extends:** `Employee`
- **Fields:** `hoursWorked`
- **Constructor:** Initializes `name`, `email`, `salary`, `hoursWorked` through superclass constructor.
- **Method Override:** Implements `calculatePay()` based on part-time hours worked.

## `EmployeeService` Class

### `EmployeeService`

- **Method:** `calculateEmployeePay(Employee employee)`
- **Functionality:** Calculates employee pay using polymorphism (`employee.calculatePay()`).

## Explanation

The Liskov Substitution Principle ensures that `FullTimeEmployee` and `PartTimeEmployee` can be used interchangeably with `Employee` in contexts such as `EmployeeService`. Each subclass (`FullTimeEmployee` and `PartTimeEmployee`) overrides the `calculatePay()` method to provide specialized behavior specific to their type of employee.

By adhering to LSP, we maintain a flexible and extensible design where subclasses can extend the behavior of the superclass without altering its correctness or violating expected behaviors.
