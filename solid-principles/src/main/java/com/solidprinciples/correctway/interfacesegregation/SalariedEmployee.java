package com.solidprinciples.correctway.interfacesegregation;

public interface SalariedEmployee extends Employee {
    double getAnnualSalary();
    void setAnnualSalary(double annualSalary);
}