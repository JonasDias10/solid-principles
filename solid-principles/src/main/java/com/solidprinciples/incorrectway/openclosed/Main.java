package com.solidprinciples.incorrectway.openclosed;

/**
 * This class encapsulates employee information and behaviors related to an employee's data,
 * including name, email, salary, and pay calculation.
 *
 * <p>However, embedding the logic for different types of payment calculations directly within
 * this class violates the Open/Closed Principle (OCP). OCP states that a class should be
 * open for extension but closed for modification. By including payment logic for various
 * employee types within the {@code calculatePay()} method, this class becomes difficult to extend
 * without modifying its source code.
 */
public class Main {
}
