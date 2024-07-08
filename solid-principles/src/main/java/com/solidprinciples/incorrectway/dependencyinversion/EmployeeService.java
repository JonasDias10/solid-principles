package com.solidprinciples.incorrectway.dependencyinversion;

public class EmployeeService {
    private final EmailService emailService;
    private final DatabaseService databaseService;

    public EmployeeService() {
        this.emailService = new EmailService();
        this.databaseService = new DatabaseService();
    }

    public void saveEmployee(Employee employee) {
        databaseService.saveEmployee(employee);
    }

    public void notifyEmployee(Employee employee, String message) {
        emailService.sendEmail(employee.getEmail(), message);
    }
}
