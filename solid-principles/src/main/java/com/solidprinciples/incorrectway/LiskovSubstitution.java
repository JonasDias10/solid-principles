package com.solidprinciples.incorrectway;

/**
 * This class encapsulates employee information and behaviors related to an employee's data,
 * including name, email, and salary.
 *
 * <p>However, embedding specific types of employee behaviors directly within this class
 * violates the Liskov Substitution Principle (LSP). LSP states that objects of a superclass
 * should be replaceable with objects of a subclass without affecting the correctness of the
 * program. If a subclass modifies the behavior of {@code calculatePay} in an unexpected way,
 * it could lead to incorrect results when used polymorphically.
 *
 * <p>For instance, the {@code PartTimeEmployee} subclass modifies the behavior of {@code calculatePay}
 * to calculate pay based on hours worked, which might not be expected in the context of the superclass
 * {@code Employee}, where {@code calculatePay} might be expected to calculate monthly salary.
 */
public class LiskovSubstitution {
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
            return salary;
        }
    }

    private static class PartTimeEmployee extends Employee {
        private final double hoursWorked;

        public PartTimeEmployee(String name, String email, double salary, double hoursWorked) {
            super(name, email, salary);
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculatePay() {
            return getSalary() * hoursWorked;
        }
    }
}
