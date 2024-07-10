# Open/Closed Principle

The Open/Closed Principle (OCP) is a principle in object-oriented design that states:

1. **Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.**

In this case, the OCP is demonstrated through the following classes:

## Superclass

### `Employee`

- **Fields:** `name`, `email`, `salary`
- **Methods:** `getName()`, `setName(String name)`, `getEmail()`, `setEmail(String email)`, `getSalary()`, `setSalary(double salary)`, `abstract double calculatePay()`

## Subclasses

### `HourlyEmployee`

- **Extends:** `Employee`
- **Fields:** `hoursWorked`
- **Constructor:** Initializes `name`, `email`, `salary`, `hoursWorked` through superclass constructor.
- **Method Override:** Implements `calculatePay()` based on hours worked and hourly rate.

### `SalariedEmployee`

- **Extends:** `Employee`
- **Constructor:** Initializes `name`, `email`, `salary` through superclass constructor.
- **Method Override:** Implements `calculatePay()` based on fixed salary.

## Explanation

The Open/Closed Principle is maintained in this example by allowing the `Employee` superclass to be extended by subclasses (`HourlyEmployee` and `SalariedEmployee`) without modifying the existing `Employee` class itself. Each subclass introduces new behavior (`calculatePay()` method implementation) while inheriting and reusing the common attributes and methods from the superclass.

This design approach supports future changes by allowing new types of employees to be added (open for extension) without needing to modify the existing `Employee` class (closed for modification). This adherence to OCP promotes code stability, reduces risk when making changes, and encourages reusable and maintainable code.
