package com.solidprinciples.correctway;

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
public class DependencyInversion {
    private static class Employee {
        private String name;
        private String email;

        public Employee(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public interface EmailService {
        void sendEmail(String email, String message);
    }

    private interface DatabaseService {
        void saveEmployee(Employee employee);
    }

    private static class EmailServiceImpl implements EmailService {
        @Override
        public void sendEmail(String email, String message) {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }

    private static class DatabaseServiceImpl implements DatabaseService {
        @Override
        public void saveEmployee(Employee employee) {
            System.out.println("Saving employee: " + employee.getName());
        }
    }

    private static class EmployeeService {
        private final EmailService emailService;
        private final DatabaseService databaseService;

        public EmployeeService(EmailService emailService, DatabaseService databaseService) {
            this.emailService = emailService;
            this.databaseService = databaseService;
        }

        public void saveEmployee(Employee employee) {
            databaseService.saveEmployee(employee);
        }

        public void notifyEmployee(Employee employee, String message) {
            emailService.sendEmail(employee.getEmail(), message);
        }
    }

    public static void main(String[] args) {
        var emailService = new EmailServiceImpl();
        var databaseService = new DatabaseServiceImpl();

        var employeeService = new EmployeeService(emailService, databaseService);

        var employee = new Employee("Jonas", "jonas@example.com");

        employeeService.saveEmployee(employee);
        employeeService.notifyEmployee(employee, "Welcome to the company!");
    }
}
