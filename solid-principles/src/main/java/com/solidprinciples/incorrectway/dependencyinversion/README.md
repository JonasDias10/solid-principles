# Dependency Inversion Principle

In this case, the Dependency Inversion Principle (DIP) is not correctly implemented. Here’s an analysis of the incorrect implementation:

## Classes

### `DatabaseService`

- **Responsibility:** Handles database operations.
- **Method:** `saveEmployee(Employee employee)`: Saves employee data to the database.

### `EmailService`

- **Responsibility:** Handles email operations.
- **Method:** `sendEmail(String email, String message)`: Sends an email to the specified email address with a message.

### `Employee`

- **Responsibility:** Represents an employee with attributes `name` and `email`.
- **Methods:** `getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`: Provide access to employee data.

### `EmployeeService`

- **Responsibility:** Manages employee-related operations.
- **Fields:** `emailService`: Instance of `EmailService` to send emails, `databaseService`: Instance of `DatabaseService` to save employee data.
- **Methods:**
  - `saveEmployee(Employee employee)`: Utilizes `databaseService` directly to save employee data.
  - `notifyEmployee(Employee employee, String message)`: Uses `emailService` directly to send notifications to employees.

## Issues with Dependency Inversion

1. **Direct Dependency Instantiation:**

   - `EmployeeService` directly creates instances of `EmailService` and `DatabaseService` (`this.emailService = new EmailService();`, `this.databaseService = new DatabaseService();`). This creates tight coupling between `EmployeeService` and the concrete implementations (`EmailService` and `DatabaseService`), violating the DIP.

2. **High-level Module Depends on Low-level Module:**

   - `EmployeeService` directly depends on `EmailService` and `DatabaseService`, which are low-level modules. According to DIP, both high-level and low-level modules should depend on abstractions (interfaces), not concrete implementations.

3. **Lack of Abstractions:**
   - There are no interfaces defining `EmailService` or `DatabaseService`, which makes it impossible to swap implementations or extend functionality easily without modifying `EmployeeService`.

## Consequences

- **Reduced Flexibility:** Changes to `EmailService` or `DatabaseService` implementations require modifications to `EmployeeService`, leading to potential ripple effects across the codebase.
- **Testing Challenges:** Difficult to unit test `EmployeeService` in isolation due to its direct dependency instantiation, which complicates mocking and dependency injection.

## Corrective Action

To adhere to the Dependency Inversion Principle:

- Introduce interfaces (`EmailService` and `DatabaseService`) that define the required operations.
- Modify `EmployeeService` to depend on these interfaces instead of concrete implementations.
- Use dependency injection (constructor injection, setter injection) to provide instances of `EmailService` and `DatabaseService` to `EmployeeService`, enabling easier testing and flexibility in changing implementations.
