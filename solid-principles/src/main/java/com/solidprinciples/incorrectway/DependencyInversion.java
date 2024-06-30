package com.solidprinciples.incorrectway;

/**
 * This class illustrates a violation of the Dependency Inversion Principle (DIP).
 * It directly depends on low-level modules, namely EmailService and DatabaseService,
 * rather than depending on abstractions. According to DIP, high-level modules should
 * not depend on low-level modules; instead, both should depend on abstractions.
 *
 * <p>The tight coupling between EmployeeService, EmailService, and DatabaseService makes
 * the code difficult to maintain and test. Any changes to the implementation of
 * EmailService or DatabaseService will directly impact the functionality of EmployeeService,
 * leading to potential cascading changes throughout the codebase.
 */
public class DependencyInversion {
    private static class EmployeeService {
        private final EmailService emailService;
        private final DatabaseService databaseService;

        public EmployeeService() {
            this.emailService = new EmailService();
            this.databaseService = new DatabaseService();
        }

        public void saveEmployee(Employee employee) {
            databaseService.saveEmployee(employee);
        }

        public void notifyEmployee(Employee employee, String message) {
            emailService.sendEmail(employee.getEmail(), message);
        }
    }

    private static class EmailService {
        public void sendEmail(String email, String message) {
            System.out.println("Sending email...");
        }
    }

    private static class DatabaseService {
        public void saveEmployee(Employee employee) {
            System.out.println("Saving employee...");
        }
    }

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
}
