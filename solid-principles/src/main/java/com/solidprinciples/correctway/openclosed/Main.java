package com.solidprinciples.correctway.openclosed;

/**
 * The OpenClosed class demonstrates the Open/Closed Principle (OCP).
 *
 * <p>This class defines an abstract base class Employee, encapsulating common attributes such as name, email,
 * and salary. It serves as a foundation for different types of employees, allowing extension through subclassing
 * (HourlyEmployee, SalariedEmployee) without modifying the existing codebase. Each subclass provides its own
 * implementation of the calculatePay() method, enabling varied pay calculation strategies while adhering to the
 * principle of open for extension and closed for modification.
 */
public class Main {
}
