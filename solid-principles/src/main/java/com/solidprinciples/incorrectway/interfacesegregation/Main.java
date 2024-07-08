package com.solidprinciples.incorrectway.interfacesegregation;

/**
 * This class demonstrates a violation of the Interface Segregation Principle (ISP).
 *
 * <p>ISP states that clients should not be forced to depend on interfaces they do not use.
 * By combining methods specific to both part-time and full-time employees in a single
 * interface, Employee, this class forces implementing classes to provide unnecessary
 * implementations.
 *
 * <p>The Employee interface includes methods such as getHoursWorked() and getBenefits(),
 * which are only relevant for PartTimeEmployee and FullTimeEmployee respectively.
 * This design leads to empty or unsupported method implementations in classes where
 * these methods are not applicable, violating the principle of interface segregation.
 */
public class Main {

}
