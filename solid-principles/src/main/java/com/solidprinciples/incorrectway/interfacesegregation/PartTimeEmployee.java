package com.solidprinciples.incorrectway.interfacesegregation;

public class PartTimeEmployee implements Employee {
    private String name;
    private String email;
    private final double hourlyRate;
    private final double hoursWorked;

    public PartTimeEmployee(String name, String email, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.email = email;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
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
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double getBenefits() {
        throw new UnsupportedOperationException("Part-time employees do not have benefits");
    }
}