package com.solidprinciples.correctway.openclosed;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, String email, double salary) {
        super(name, email, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}