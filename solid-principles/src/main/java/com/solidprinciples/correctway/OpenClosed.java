package com.solidprinciples.correctway;

public class OpenClosed {
    /**
     * The Employee class represents a basic employee with a name, email, and salary.

     * This class is designed as an abstract class to adhere to the Open/Closed Principle (OCP).
     * It provides a general structure for different types of employees and allows extending
     * without modifying the existing code.
     */
    private abstract static class Employee {
        private String name;
        private String email;
        private double salary;

        public Employee(String name, String email, double salary) {
            this.name = name;
            this.email = email;
            this.salary = salary;
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

        public abstract double calculatePay();
    }

    /**
     * The HourlyEmployee class represents an employee who is paid based on the number of hours worked.

     * This class adheres to the Open/Closed Principle (OCP) as it extends the Employee class and provides
     * specific implementation for hourly employees without modifying the base Employee class.
     */
    private static class HourlyEmployee extends Employee {
        private double hoursWorked;

        public HourlyEmployee(String name, String email, double salary, double hoursWorked) {
            super(name, email, salary);
            this.hoursWorked = hoursWorked;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculatePay() {
            return getSalary() * hoursWorked;
        }
    }

    /**
     * The SalariedEmployee class represents an employee who is paid a fixed salary.

     * This class adheres to the Open/Closed Principle (OCP) as it extends the Employee class and provides
     * specific implementation for salaried employees without modifying the base Employee class.
     */
    private static class SalariedEmployee extends Employee {
        public SalariedEmployee(String name, String email, double salary) {
            super(name, email, salary);
        }

        @Override
        public double calculatePay() {
            return getSalary();
        }
    }
}
