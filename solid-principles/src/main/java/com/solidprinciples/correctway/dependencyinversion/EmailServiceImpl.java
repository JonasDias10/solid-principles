package com.solidprinciples.correctway.dependencyinversion;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}