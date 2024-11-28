package org.example.principles.solid.dip;

public class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
