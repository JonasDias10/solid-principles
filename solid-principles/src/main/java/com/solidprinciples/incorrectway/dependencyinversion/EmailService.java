package com.solidprinciples.incorrectway.dependencyinversion;

public class EmailService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email...");
    }
}
