package com.solidprinciples.correctway;

/**
 * Demonstrates the Interface Segregation Principle (ISP) by segregating interfaces
 * for different types of employees: Employee, HourlyEmployee, and SalariedEmployee.
 *
 * <p>Employee interface defines basic attributes and methods common to all employees,
 * allowing implementing classes to focus only on what they need.
 *
 * <p>HourlyEmployee interface extends Employee with methods specific to hourly employees,
 * focusing on hours worked and hourly rate calculations.
 *
 * <p>SalariedEmployee interface extends Employee with methods specific to salaried employees,
 * concentrating on annual salary calculations.
 *
 * <p>This design promotes adherence to ISP by preventing classes from implementing unnecessary methods,
 * ensuring clarity and maintainability in the codebase.
 */
public class InterfaceSegregation {
    private interface Employee {
        String getName();
        void setName(String name);
        String getEmail();
        void setEmail(String email);
        double calculatePay();
    }

    private interface HourlyEmployee extends Employee {
        double getHoursWorked();
        void setHoursWorked(double hoursWorked);
        double getHourlyRate();
        void setHourlyRate(double hourlyRate);
    }

    private interface SalariedEmployee extends Employee {
        double getAnnualSalary();
        void setAnnualSalary(double annualSalary);
    }

    private static class HourlyEmployeeImpl implements HourlyEmployee {
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

    private static class SalariedEmployeeImpl implements SalariedEmployee {
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
}