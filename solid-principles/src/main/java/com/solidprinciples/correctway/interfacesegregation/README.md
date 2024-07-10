# Interface Segregation Principle

The Interface Segregation Principle (ISP) is one of the SOLID principles that emphasizes:

1. **Clients should not be forced to depend on interfaces they do not use.**
2. **The dependency of one class to another should depend on the smallest possible interface.**

In this case, the ISP is implemented by segregating interfaces based on different types of employees:

## Interfaces

### `Employee`

- **Methods:** `getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`, `calculatePay()`

### `HourlyEmployee`

- **Extends:** `Employee`
- **Additional Methods:** `getHoursWorked()`, `setHoursWorked(double hoursWorked)`, `getHourlyRate()`, `setHourlyRate(double hourlyRate)`

### `SalariedEmployee`

- **Extends:** `Employee`
- **Additional Methods:** `getAnnualSalary()`, `setAnnualSalary(double annualSalary)`

## Implementations

### `HourlyEmployeeImpl`

- **Implements:** `HourlyEmployee`
- **Fields:** `name`, `email`, `hourlyRate`, `hoursWorked`
- **Methods:** Implementations for all interface methods including `calculatePay()`

### `SalariedEmployeeImpl`

- **Implements:** `SalariedEmployee`
- **Fields:** `name`, `email`, `annualSalary`
- **Methods:** Implementations for all interface methods including `calculatePay()`

## Explanation

By segregating interfaces (`Employee`, `HourlyEmployee`, `SalariedEmployee`), we ensure that each type of employee only has to implement methods relevant to their role. This prevents the implementation of unnecessary methods in classes that don't need them, adhering to the ISP.

Using the ISP leads to cleaner, more maintainable code where classes and interfaces are focused and have clear responsibilities, reducing the impact of changes and promoting reusability.
