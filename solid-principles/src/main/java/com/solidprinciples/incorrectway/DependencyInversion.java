package com.solidprinciples.incorrectway;

public class DependencyInversion {
    /**
     * Represents a service for managing employees.
     * This class depends directly on low-level modules `EmailService` and `DatabaseService`,
     * which violates the Dependency Inversion Principle (DIP). DIP states that high-level
     * modules should not depend on low-level modules, but rather on abstractions.

     * This tight coupling makes the code difficult to maintain and test, as changes to the
     * low-level modules will impact the high-level module.
     */
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
