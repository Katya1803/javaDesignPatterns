package org.example.patterns.structural.adapter;


/**
 * Class SmsService.
 * Existing class that does not implement Notification interface.
 */
public class SmsService {
    public void sendSms(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
