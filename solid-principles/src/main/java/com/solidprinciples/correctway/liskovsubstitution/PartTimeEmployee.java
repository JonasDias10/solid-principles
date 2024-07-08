package com.solidprinciples.correctway.liskovsubstitution;

public class PartTimeEmployee extends Employee {
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