package com.nt.Utlity;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class MailSender {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String subject, String body, String to , File f) {
        try {
            MimeMessage mime = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(mime,true);
            messageHelper.setSubject(subject);
            messageHelper.setText(body, true);
            messageHelper.setTo(to);
            messageHelper.addAttachment("plan_info", f);
            mailSender.send(mime);
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }
    }
}
