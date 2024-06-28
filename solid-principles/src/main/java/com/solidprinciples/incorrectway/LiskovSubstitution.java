package com.solidprinciples.incorrectway;

public class LiskovSubstitution {
    /**
     * Represents an Employee in the company.
     * This class encapsulates employee information and behaviors related to an employee's data,
     * including name, email, and salary.

     * However, embedding logic that assumes specific types of employees directly within this class
     * violates the Liskov Substitution Principle (LSP). LSP states that objects of a superclass
     * should be replaceable with objects of a subclass without affecting the correctness of the
     * program. If a subclass modifies the behavior of `calculatePay` in an unexpected way,
     * it could lead to incorrect results when used polymorphically.

     * For instance, the `PartTimeEmployee` subclass modifies the behavior of `calculatePay` to
     * handle overtime, which might not be expected in the context of the superclass.
     */
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

        public String getEmail() {
            return email;
        }

        public double getSalary() {
            return salary;
        }

        public double calculatePay() {
            return salary;
        }
    }

    private static class PartTimeEmployee extends Employee {
        private double hoursWorked;

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
