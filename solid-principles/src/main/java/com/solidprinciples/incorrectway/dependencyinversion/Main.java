package com.solidprinciples.incorrectway.dependencyinversion;

/**
 * This class illustrates a violation of the Dependency Inversion Principle (DIP).
 * It directly depends on low-level modules, namely EmailService and DatabaseService,
 * rather than depending on abstractions. According to DIP, high-level modules should
 * not depend on low-level modules; instead, both should depend on abstractions.
 *
 * <p>The tight coupling between EmployeeService, EmailService, and DatabaseService makes
 * the code difficult to maintain and test. Any changes to the implementation of
 * EmailService or DatabaseService will directly impact the functionality of EmployeeService,
 * leading to potential cascading changes throughout the codebase.
 */
public class Main {
}
