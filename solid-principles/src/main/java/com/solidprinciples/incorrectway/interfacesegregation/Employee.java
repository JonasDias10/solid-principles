package com.solidprinciples.incorrectway.interfacesegregation;

public interface Employee {
    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    double calculatePay();

    double getHoursWorked(); // Not relevant for full-time employees

    double getBenefits(); // Not relevant for part-time employees
}
