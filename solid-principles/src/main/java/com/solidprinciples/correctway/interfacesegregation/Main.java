package com.solidprinciples.correctway.interfacesegregation;

/**
 * Demonstrates the Interface Segregation Principle (ISP) by segregating interfaces
 * for different types of employees: Employee, HourlyEmployee, and SalariedEmployee.
 *
 * <p>Employee interface defines basic attributes and methods common to all employees,
 * allowing implementing classes to focus only on what they need.
 *
 * <p>HourlyEmployee interface extends Employee with methods specific to hourly employees,
 * focusing on hours worked and hourly rate calculations.
 *
 * <p>SalariedEmployee interface extends Employee with methods specific to salaried employees,
 * concentrating on annual salary calculations.
 *
 * <p>This design promotes adherence to ISP by preventing classes from implementing unnecessary methods,
 * ensuring clarity and maintainability in the codebase.
 */
public class Main {
}