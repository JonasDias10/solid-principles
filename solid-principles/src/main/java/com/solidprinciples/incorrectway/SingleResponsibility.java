package com.solidprinciples.incorrectway;

/**
 * This class encapsulates employee information and behaviors related to an employee's data,
 * including name, email, and salary calculation. However, it also embeds database saving
 * and email sending logic, violating the Single Responsibility Principle (SRP).
 *
 * <p>The SRP states that a class should have only one reason to change. By combining employee
 * data management with database and email functionalities, this class becomes tightly coupled
 * and difficult to maintain, test, and extend. Ideally, responsibilities such as database
 * interactions and email sending should be delegated to separate classes or services.
 */
public class SingleResponsibility {
    private static class Employee {
        private String name;
        private String email;
        private double salary;

        public Employee(String name, String email, double salary) {
            this.name = name;
            this.email = email;
            this.salary = salary;
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

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double calculatePay() {
            return salary * 1.1;
        }

        public void save() {
            var database = new Database();
            database.save(this);
        }

        public void sendEmail(String message) {
            EmailService emailService = new EmailService();
            emailService.sendEmail(email, message);
        }
    }

    private static class Database {
        public void save(Employee employee) {
            System.out.println("Saving employee...");
        }
    }

    private static class EmailService {
        public void sendEmail(String email, String message) {
            System.out.println("Sending email...");
        }
    }
}
