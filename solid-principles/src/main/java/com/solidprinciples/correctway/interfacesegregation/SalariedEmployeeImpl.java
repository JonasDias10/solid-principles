package com.solidprinciples.correctway.interfacesegregation;

public class SalariedEmployeeImpl implements SalariedEmployee {
    private String name;
    private String email;
    private double annualSalary;

    public SalariedEmployeeImpl(String name, String email, double annualSalary) {
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
    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
