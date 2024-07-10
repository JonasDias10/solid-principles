# Open/Closed Principle

In this context, the Open/Closed Principle (OCP) is not correctly implemented. Here’s an analysis of the incorrect implementation:

## `Employee` Class

### Responsibility:

Represents an employee with attributes `name`, `email`, `salary`, and `employeeType`.

### Methods:

- `getName()`, `setName(String name)`: Getters and setters for employee name.
- `getEmail()`, `setEmail(String email)`: Getters and setters for employee email.
- `getSalary()`, `setSalary(double salary)`: Getters and setters for employee salary.
- `getEmployeeType()`, `setEmployeeType(String employeeType)`: Getters and setters for employee type.
- `calculatePay()`: Calculates the pay based on the employee type (`Hourly`, `Salaried`, `Commissioned`) using a switch statement.

## Issues with Open/Closed Principle

1. **Violation of OCP:**

   - The `Employee` class is not closed for modification because every time a new type of employee (`Hourly`, `Salaried`, `Commissioned`) is introduced, the `calculatePay()` method needs to be modified to accommodate the new type. This violates the OCP, which states that classes should be open for extension but closed for modification.

2. **Hard-coded Logic:**

   - The logic for calculating pay (`calculatePay()`) is hard-coded within the class based on the `employeeType` attribute. This approach tightly couples the calculation logic with the class implementation, making it difficult to extend or modify without altering existing code.

3. **Maintenance Challenges:**
   - Adding new employee types requires modifying existing code (`calculatePay()`), which can introduce errors and affect the stability of the class. This violates the principle of minimizing changes to existing code when extending functionality.

## Consequences

- **Rigidity in Design:** The design restricts the ability to add new employee types without modifying existing code, leading to potential cascading changes and increased maintenance effort.

- **Reduced Extensibility:** Hard-coding logic based on specific types (`Hourly`, `Salaried`, `Commissioned`) limits the flexibility to introduce new employee types or adjust existing ones without risking unintended side effects.

## Corrective Action

To adhere to the Open/Closed Principle:

- **Use Polymorphism:** Instead of using a switch statement within `calculatePay()`, utilize polymorphism to delegate pay calculation to specific implementations of an `Employee` interface or abstract class. Each concrete implementation (`HourlyEmployee`, `SalariedEmployee`, etc.) would override a method like `calculatePay()` to provide its specific calculation logic.

- **Abstract Employee Types:** Define an abstraction (interface or abstract class) that all employee types (`HourlyEmployee`, `SalariedEmployee`, etc.) implement, ensuring each class encapsulates its specific pay calculation logic without modifying shared code.

- **Dependency Injection:** Use dependency injection to provide the appropriate implementation of an `Employee` type (`HourlyEmployee`, `SalariedEmployee`, etc.) to client code, promoting loose coupling and enhancing flexibility in code maintenance and extension.
