package com.solidprinciples.incorrectway.interfacesegregation;

public class FullTimeEmployee implements Employee {
    private String name;
    private String email;
    private final double annualSalary;

    public FullTimeEmployee(String name, String email, double annualSalary) {
        this.name = name;
        this.email = email;
        this.annualSalary = annualSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    @Override
    public double getHoursWorked() {
        throw new UnsupportedOperationException("Full-time employees do not track hours worked");
    }

    @Override
    public double getBenefits() {
        return annualSalary * 0.3;
    }
}