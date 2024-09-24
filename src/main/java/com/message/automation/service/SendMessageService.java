package com.message.automation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public String sendMail(String[] receivers, String about, String message) {
        try {
            for (String receiver : receivers) {
                SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
                simpleMailMessage.setFrom(sender);
                simpleMailMessage.setTo(receiver);
                simpleMailMessage.setSubject(about);
                simpleMailMessage.setText(message);
                javaMailSender.send(simpleMailMessage);
            }
            return "Emails sent successfully";
        } catch (Exception e) {
            return "Error sending emails: " + e.getMessage();
        }
    }
}
