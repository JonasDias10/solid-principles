# Liskov Substitution Principle

In this case, the Liskov Substitution Principle (LSP) is not correctly implemented. Here’s an analysis of the incorrect implementation:

## Superclass

### `Employee` Class

- **Responsibility:** Represents a general employee with attributes `name`, `email`, `salary`.
- **Methods:** `getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`, `getSalary()`, `setSalary(double salary)`, `calculatePay()`: Calculates and returns the salary.

## Subclass

### `PartTimeEmployee` Class

- **Responsibility:** Represents a part-time employee, inheriting from `Employee`.
- **Fields:** `hoursWorked`: Additional field specific to part-time employees.
- **Constructor:** Initializes `name`, `email`, `salary`, and `hoursWorked` through superclass constructor.
- **Method Override:** Overrides `calculatePay()` to calculate pay based on hours worked and hourly rate.

## Issues with Liskov Substitution

1. **Behavioral Violation:**

   - `PartTimeEmployee` overrides `calculatePay()` to calculate pay based on `hoursWorked` and `salary`. This is different from the behavior defined in the superclass `Employee`, where `calculatePay()` simply returns `salary`. This violates the LSP because the subclass behavior (`PartTimeEmployee`) does not strictly adhere to the behavior of its superclass (`Employee`).

2. **Unexpected Behavior:**
   - Clients expecting a generic `Employee` instance (e.g., calling `calculatePay()`) will receive unexpected results when dealing with instances of `PartTimeEmployee`. This inconsistency can lead to errors and unexpected behaviors in client code.

## Consequences

- **Semantic Inconsistency:** Subclasses that do not adhere to the behavior expected from their superclass can lead to confusion and errors in client code, undermining the principle of substitutability.

- **Maintenance Challenges:** Changes to superclass behavior (`Employee`) may unintentionally affect subclasses (`PartTimeEmployee`) that override or rely on superclass methods, potentially introducing bugs or requiring extensive refactoring.

## Corrective Action

To adhere to the Liskov Substitution Principle:

- **Ensure Behavioral Consistency:** Subclasses (`PartTimeEmployee`) should adhere to and extend the behavior defined by their superclass (`Employee`). If `calculatePay()` is overridden, it should maintain the same semantic meaning or behavior as defined in the superclass.

- **Review and Refactor:** Review subclass implementations to ensure they do not alter or extend behavior in a way that violates client expectations or introduces unexpected behaviors.

- **Refine Class Hierarchies:** Consider refactoring class hierarchies to better align with expected behaviors and responsibilities, ensuring subclasses can be used interchangeably with their superclass without altering expected outcomes.
