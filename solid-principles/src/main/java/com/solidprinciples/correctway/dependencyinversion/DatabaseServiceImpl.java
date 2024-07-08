package com.solidprinciples.correctway.dependencyinversion;

public class DatabaseServiceImpl implements DatabaseService {
    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("Saving employee: " + employee.getName());
    }
}