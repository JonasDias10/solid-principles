package com.solidprinciples.correctway;

/**
 * This class demonstrates the Single Responsibility Principle (SRP).
 *
 * <p>It defines an Employee class that represents a basic employee with attributes such as
 * name, email, and salary. The Employee class adheres to SRP by encapsulating only the
 * properties and basic details of an employee.
 *
 * <p>Additionally, the class includes a SalaryCalculator class responsible for calculating
 * the pay of an employee. This separation of concerns ensures that the Employee class focuses
 * solely on representing an employee's data, while the SalaryCalculator class handles the
 * responsibility of computing salaries based on a predefined logic.
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
    }

    private static class SalaryCalculator {
        public double calculatePay(Employee employee) {
            return employee.getSalary() * 1.1;
        }
    }
}
