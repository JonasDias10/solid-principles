package com.solidprinciples.correctway.dependencyinversion;

/**
 * Demonstrates the Dependency Inversion Principle (DIP) by decoupling high-level modules
 * from low-level implementation details through the use of abstractions.
 *
 * <p>This class defines interfaces and their implementations for handling email services
 * and database operations related to employees. It exemplifies the use of interfaces to
 * provide flexibility and extensibility in service implementations without directly
 * depending on concrete classes.
 *
 * <p>The {@link EmailService} interface defines methods for sending emails, while the
 * {@link DatabaseService} interface defines methods for saving employee data to a database.
 *
 * <p>The {@link EmployeeService} class utilizes these interfaces to perform operations such
 * as saving employee data and sending notifications via injected dependencies, adhering to
 * the Dependency Inversion Principle by depending on abstractions rather than concrete implementations.
 *
 * <p>Example usage is provided in the main method, demonstrating how different
 * implementations of {@link EmailService} and {@link DatabaseService} can be instantiated
 * and used interchangeably within the {@link EmployeeService}.
 */
public class Main {
    public static void main(String[] args) {
        var emailService = new EmailServiceImpl();
        var databaseService = new DatabaseServiceImpl();

        var employeeService = new EmployeeService(emailService, databaseService);

        var employee = new Employee("Jonas", "jonas@example.com");

        employeeService.saveEmployee(employee);
        employeeService.notifyEmployee(employee, "Welcome to the company!");
    }
}
