package com.solidprinciples.correctway;

public class LiskovSubstitution {
    /**
     * The Employee class represents a basic employee with a name, email, and salary.

     * This class adheres to the Liskov Substitution Principle (LSP) by providing a common interface
     * for all types of employees, ensuring that subclasses like PartTimeEmployee and FullTimeEmployee
     * can be used interchangeably where an Employee is expected.
     */
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

    private static class FullTimeEmployee extends Employee {
        public FullTimeEmployee(String name, String email, double salary) {
            super(name, email, salary);
        }

        @Override
        public double calculatePay() {
            return getSalary();
        }
    }

    private static class EmployeeService {
        public double calculateEmployeePay(Employee employee) {
            return employee.calculatePay();
        }
    }

    public static void main(String[] args) {
        var partTimeEmployee = new PartTimeEmployee("Jonas", "jonas@example.com", 40.0, 20);
        var fullTimeEmployee = new FullTimeEmployee("Dias", "dias@example.com", 3000.0);

        var employeeService = new EmployeeService();

        double partTimePay = employeeService.calculateEmployeePay(partTimeEmployee);
        System.out.println("Part-Time Employee Pay: $" + partTimePay);

        double fullTimePay = employeeService.calculateEmployeePay(fullTimeEmployee);
        System.out.println("Full-Time Employee Pay: $" + fullTimePay);
    }
}

