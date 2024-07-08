package com.solidprinciples.correctway.liskovsubstitution;

public class EmployeeService {
    public double calculateEmployeePay(Employee employee) {
        return employee.calculatePay();
    }
}
