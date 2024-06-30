package com.solidprinciples.correctway;

/**
 * The OpenClosed class demonstrates the Open/Closed Principle (OCP).
 *
 * <p>This class defines an abstract base class Employee, encapsulating common attributes such as name, email,
 * and salary. It serves as a foundation for different types of employees, allowing extension through subclassing
 * (HourlyEmployee, SalariedEmployee) without modifying the existing codebase. Each subclass provides its own
 * implementation of the calculatePay() method, enabling varied pay calculation strategies while adhering to the
 * principle of open for extension and closed for modification.
 */
public class OpenClosed {
    private abstract static class Employee {
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

        public abstract double calculatePay();
    }

    private static class HourlyEmployee extends Employee {
        private double hoursWorked;

        public HourlyEmployee(String name, String email, double salary, double hoursWorked) {
            super(name, email, salary);
            this.hoursWorked = hoursWorked;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculatePay() {
            return getSalary() * hoursWorked;
        }
    }

    private static class SalariedEmployee extends Employee {
        public SalariedEmployee(String name, String email, double salary) {
            super(name, email, salary);
        }

        @Override
        public double calculatePay() {
            return getSalary();
        }
    }
}
