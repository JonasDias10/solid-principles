package com.solidprinciples.correctway.openclosed;

public class HourlyEmployee extends Employee {
    private double hoursWorked;

    public HourlyEmployee(String name, String email, double salary, double hoursWorked) {
        super(name, email, salary);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return getSalary() * hoursWorked;
    }
}