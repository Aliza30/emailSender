package com.emailsender.SpringEmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class emailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String email, String subject, String Body){
        SimpleMailMessage msg= new SimpleMailMessage();
        msg.setFrom("aliza302001@gmail.com");
        msg.setTo(email);
        msg.setText(Body);
        msg.setSubject(subject);

        mailSender.send(msg);

        System.out.println("Mail send Successfully");
    }
}
