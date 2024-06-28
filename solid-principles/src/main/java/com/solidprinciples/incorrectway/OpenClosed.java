package com.solidprinciples.incorrectway;

public class OpenClosed {
    /**
     * Represents an Employee in the company.
     * This class encapsulates employee information and behaviors related to an employee's data,
     * including name, email, salary, and pay calculation.

     * However, embedding the logic for different types of payment calculations directly within
     * this class violates the Open/Closed Principle (OCP). OCP states that a class should be
     * open for extension but closed for modification. By including payment logic for various
     * employee types within the `calculatePay()` method, this class becomes difficult to extend
     * without modifying its source code.
     */
    private static class Employee {
        private String name;
        private String email;
        private double salary;
        private String employeeType;

        public Employee(String name, String email, double salary, String employeeType) {
            this.name = name;
            this.email = email;
            this.salary = salary;
            this.employeeType = employeeType;
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

        public String getEmployeeType() {
            return employeeType;
        }

        public double calculatePay() {
            return switch (employeeType) {
                case "Hourly" -> salary * 1.1;
                case "Salaried" -> salary * 1.2;
                case "Commissioned" -> salary * 1.3;
                default -> throw new IllegalArgumentException("Unknown employee type: " + employeeType);
            };
        }
    }
}
