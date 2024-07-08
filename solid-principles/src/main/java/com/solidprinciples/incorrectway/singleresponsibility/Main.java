package com.solidprinciples.incorrectway.singleresponsibility;

/**
 * This class encapsulates employee information and behaviors related to an employee's data,
 * including name, email, and salary calculation. However, it also embeds database saving
 * and email sending logic, violating the Single Responsibility Principle (SRP).
 *
 * <p>The SRP states that a class should have only one reason to change. By combining employee
 * data management with database and email functionalities, this class becomes tightly coupled
 * and difficult to maintain, test, and extend. Ideally, responsibilities such as database
 * interactions and email sending should be delegated to separate classes or services.
 */
public class Main {
}
