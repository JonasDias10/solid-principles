package com.solidprinciples.correctway.interfacesegregation;

public interface Employee {
    String getName();
    
    void setName(String name);

    String getEmail();

    void setEmail(String email);

    double calculatePay();
}