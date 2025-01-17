package com.solidprinciples.incorrectway.openclosed;

public class Employee {
    private String name;
    private String email;
    private double salary;
    private String employeeType;

    public Employee(String name, String email, double salary, String employeeType) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double calculatePay() {
        return switch (employeeType) {
            case "Hourly" -> salary * 1.1;
            case "Salaried" -> salary * 1.2;
            case "Commissioned" -> salary * 1.3;
            default -> throw new IllegalArgumentException("Unknown employee type: " + employeeType);
        };
    }
}
