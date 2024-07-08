package com.solidprinciples.correctway.dependencyinversion;

public class EmployeeService {
    private final EmailService emailService;
    private final DatabaseService databaseService;

    public EmployeeService(EmailService emailService, DatabaseService databaseService) {
        this.emailService = emailService;
        this.databaseService = databaseService;
    }

    public void saveEmployee(Employee employee) {
        databaseService.saveEmployee(employee);
    }

    public void notifyEmployee(Employee employee, String message) {
        emailService.sendEmail(employee.getEmail(), message);
    }
}
