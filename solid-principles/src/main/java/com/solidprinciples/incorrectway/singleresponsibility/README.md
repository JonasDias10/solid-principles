# Single Responsibility Principle

In this case, the Single Responsibility Principle (SRP) is not correctly implemented. Here’s an analysis of the incorrect implementation:

## `Employee` Class

### Responsibility:

Represents an employee with attributes `name`, `email`, `salary`, and methods for managing and interacting with employee data.

### Methods:

- `getName()`, `setName(String name)`: Getters and setters for employee name.
- `getEmail()`, `setEmail(String email)`: Getters and setters for employee email.
- `getSalary()`, `setSalary(double salary)`: Getters and setters for employee salary.
- `calculatePay()`: Calculates and returns the pay of the employee.
- `save()`: Saves the employee data to a database using an instance of `Database`.
- `sendEmail(String message)`: Sends an email to the employee's email address using an instance of `EmailService`.

## Issues with Single Responsibility Principle

1. **Multiple Responsibilities:**

   - The `Employee` class handles both the core responsibilities of representing employee data (`name`, `email`, `salary`) and secondary responsibilities such as saving to a database and sending emails. This violates SRP by combining unrelated functionalities into a single class.

2. **Coupled Dependencies:**

   - The class directly creates instances of `Database` and `EmailService` within its methods (`save()` and `sendEmail(String message)`), leading to tight coupling. This makes the class difficult to test, maintain, and extend independently.

3. **Potential for Scalability Issues:**
   - As the application grows, adding or modifying functionalities related to database operations or email communications would require changes to the `Employee` class. This increases the risk of introducing errors and violates the principle of minimizing changes to existing code.

## Consequences

- **Reduced Cohesion:** The `Employee` class lacks cohesion as it encompasses multiple responsibilities that can be better managed by separate classes or components.

- **Difficulty in Testing:** Testing becomes challenging as each method (`save()` and `sendEmail(String message)`) involves external dependencies (`Database` and `EmailService`) that are tightly coupled to the class.

- **Maintenance Complexity:** Modifying or extending functionality related to database operations or email services requires changes across multiple classes, complicating maintenance and increasing the likelihood of introducing bugs.

## Corrective Action

To adhere to the Single Responsibility Principle:

- **Separate Concerns:** Refactor the `Employee` class to focus solely on representing employee data (`name`, `email`, `salary`) and encapsulate operations such as saving to a database and sending emails into separate classes (`EmployeeRepository`, `EmailSender`).

- **Dependency Injection:** Inject instances of `Database` and `EmailService` into the `Employee` class via constructor injection or method parameters instead of creating them internally. This promotes loose coupling and enhances testability and flexibility.

- **Use Interfaces:** Define interfaces (`DatabaseService`, `EmailService`) to abstract interactions with external dependencies, allowing for easier substitution and mocking in unit tests.
