package com.solidprinciples.incorrectway;

/**
 * This class demonstrates a violation of the Interface Segregation Principle (ISP).
 *
 * <p>ISP states that clients should not be forced to depend on interfaces they do not use.
 * By combining methods specific to both part-time and full-time employees in a single
 * interface, Employee, this class forces implementing classes to provide unnecessary
 * implementations.
 *
 * <p>The Employee interface includes methods such as getHoursWorked() and getBenefits(),
 * which are only relevant for PartTimeEmployee and FullTimeEmployee respectively.
 * This design leads to empty or unsupported method implementations in classes where
 * these methods are not applicable, violating the principle of interface segregation.
 */
public class InterfaceSegregation {
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
