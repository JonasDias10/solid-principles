package com.solidprinciples.correctway;

public class SingleResponsibility {
    /**
     * The Employee class represents a basic employee with a name, email, and salary.

     * This class adheres to the Single Responsibility Principle (SRP) as it only
     * encapsulates the properties and basic details of an employee.
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

    /**
     * The SalaryCalculator class is responsible for calculating the salary of an employee.

     * This class adheres to the Single Responsibility Principle (SRP) as it only
     * focuses on the salary calculation logic, and it can be easily extended to support
     * different salary calculation strategies in the future.
     */
    private static class SalaryCalculator {
        public double calculatePay(Employee employee) {
            return employee.getSalary() * 1.1;
        }
    }
}
