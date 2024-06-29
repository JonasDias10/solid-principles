package com.solidprinciples.incorrectway;

public class InterfaceSegregation {
    /**
     * Represents an Employee in the company.
     * This interface encapsulates behaviors related to an employee, including methods for
     * calculating pay, tracking hours worked, and managing benefits.

     * However, this violates the Interface Segregation Principle (ISP). ISP states that no
     * client should be forced to depend on methods it does not use. By including methods
     * specific to part-time and full-time employees in a single interface, all implementing
     * classes are forced to provide implementations for methods they may not need.
     */
    private interface Employee {
        String getName();
        void setName(String name);
        String getEmail();
        void setEmail(String email);
        double calculatePay();
        double getHoursWorked(); // Not relevant for full-time employees
        double getBenefits(); // Not relevant for part-time employees
    }

    private static class PartTimeEmployee implements Employee {
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

    private static class FullTimeEmployee implements Employee {
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
}
