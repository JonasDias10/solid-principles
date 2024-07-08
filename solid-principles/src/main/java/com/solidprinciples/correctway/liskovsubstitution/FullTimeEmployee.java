package com.solidprinciples.correctway.liskovsubstitution;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, String email, double salary) {
        super(name, email, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}