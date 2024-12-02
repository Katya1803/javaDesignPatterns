package org.example.patterns.structural.adapter;


/**
 * Adapter class for SmsService.
 * Implements Notification interface.
 */
public class SmsAdapter implements Notification {

    private final SmsService smsService;
    private final String phoneNumber;

    public SmsAdapter(String phoneNumber) {
        this.smsService = new SmsService();
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        // Adapter converts the interface call to SmsService
        smsService.sendSms(phoneNumber, message);
    }
}
