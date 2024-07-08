package com.solidprinciples.incorrectway.liskovsubstitution;

/**
 * This class encapsulates employee information and behaviors related to an employee's data,
 * including name, email, and salary.
 *
 * <p>However, embedding specific types of employee behaviors directly within this class
 * violates the Liskov Substitution Principle (LSP). LSP states that objects of a superclass
 * should be replaceable with objects of a subclass without affecting the correctness of the
 * program. If a subclass modifies the behavior of {@code calculatePay} in an unexpected way,
 * it could lead to incorrect results when used polymorphically.
 *
 * <p>For instance, the {@code PartTimeEmployee} subclass modifies the behavior of {@code calculatePay}
 * to calculate pay based on hours worked, which might not be expected in the context of the superclass
 * {@code Employee}, where {@code calculatePay} might be expected to calculate monthly salary.
 */
public class Main {
}
