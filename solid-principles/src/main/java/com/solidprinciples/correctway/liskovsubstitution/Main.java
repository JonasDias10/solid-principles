package com.solidprinciples.correctway.liskovsubstitution;

/**
 * The Employee class hierarchy demonstrates the Liskov Substitution Principle (LSP)
 * by defining a common interface for all types of employees, ensuring interchangeability
 * between subclasses where an Employee is expected.
 *
 * <p>It includes two concrete implementations: PartTimeEmployee and FullTimeEmployee,
 * each inheriting from the abstract base class Employee. PartTimeEmployee calculates
 * pay based on hourly rate and hours worked, while FullTimeEmployee calculates pay
 * based on an annual salary.
 *
 * <p>The EmployeeService class exemplifies usage of polymorphism where it accepts
 * any Employee subtype and calculates their pay using the calculatePay() method,
 * demonstrating adherence to the LSP.
 *
 * <p>Example usage in the main method showcases creating instances of PartTimeEmployee
 * and FullTimeEmployee, calculating their pay using EmployeeService, and printing
 * the results.
 */
public class Main {
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

