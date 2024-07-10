# Interface Segregation Principle

In this context, the Interface Segregation Principle (ISP) is not correctly implemented. Here’s an analysis of the incorrect implementation:

## Interface

### `Employee`

- **Responsibility:** Represents an employee with methods to manage general employee data (`getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`) and methods related to specific employee types (`calculatePay()`, `getHoursWorked()`, `getBenefits()`).
- **Issues:**
  - Includes methods (`getHoursWorked()`, `getBenefits()`) that are not relevant or meaningful for all implementations (`FullTimeEmployee`, `PartTimeEmployee`).

## Classes

### `FullTimeEmployee` Class

- **Responsibility:** Represents a full-time employee.
- **Methods:** Implements all methods from `Employee`, including `calculatePay()`, `getHoursWorked()`, and `getBenefits()`.
- **Issues:**
  - Implements `getHoursWorked()` and `getBenefits()` despite these methods being irrelevant for full-time employees, leading to unnecessary and potentially misleading implementations (`getHoursWorked()` throws an exception).

### `PartTimeEmployee` Class

- **Responsibility:** Represents a part-time employee.
- **Methods:** Implements all methods from `Employee`, including `calculatePay()`, `getHoursWorked()`, and `getBenefits()`.
- **Issues:**
  - Implements `getBenefits()` despite part-time employees not having benefits, leading to an exception being thrown (`getBenefits()` throws an exception).

## Consequences

- **Interface Pollution:** The `Employee` interface contains methods that are not relevant to all types of employees, violating the ISP by forcing implementations (`FullTimeEmployee`, `PartTimeEmployee`) to provide meaningless or error-prone implementations for irrelevant methods.
- **Semantic Issues:** Implementations such as `getHoursWorked()` for full-time employees and `getBenefits()` for part-time employees do not make sense, leading to potential confusion and errors in code usage.

## Corrective Action

To adhere to the Interface Segregation Principle:

- **Split Interfaces:** Define more specific interfaces tailored to the requirements of each type of employee (`FullTimeEmployee`, `PartTimeEmployee`) that do not include methods irrelevant to them.
- **Implement Interfaces Properly:** Ensure that each class (`FullTimeEmployee`, `PartTimeEmployee`) implements only the interfaces relevant to its responsibilities, avoiding unnecessary or misleading implementations.

- **Refactor Interface Design:** Refactor the `Employee` interface to provide a clear and minimal set of methods that all types of employees can reasonably support, ensuring each method has a meaningful purpose across all implementations.
