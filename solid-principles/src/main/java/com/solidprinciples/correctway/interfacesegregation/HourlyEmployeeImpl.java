package com.solidprinciples.correctway.interfacesegregation;

public class HourlyEmployeeImpl implements HourlyEmployee {
    private String name;
    private String email;
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployeeImpl(String name, String email, double hourlyRate, double hoursWorked) {
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
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}