package com.solidprinciples.correctway.singleresponsibility;

public class SalaryCalculator {
    public double calculatePay(Employee employee) {
        return employee.getSalary() * 1.1;
    }
}
