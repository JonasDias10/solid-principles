package com.solidprinciples.correctway.interfacesegregation;

public interface HourlyEmployee extends Employee {
    double getHoursWorked();
    void setHoursWorked(double hoursWorked);
    double getHourlyRate();
    void setHourlyRate(double hourlyRate);
}