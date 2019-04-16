package br.com.fivesolutions.mailsender.mailsender.service;

import java.util.Base64;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.fivesolutions.mailsender.mailsender.entity.EmailRequest;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(EmailRequest emailRequest) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(emailRequest.email);
        if (emailRequest.getPdf64() != null) {
            DataSource attachment = convertAttachment(emailRequest.getPdf64());
            if (attachment != null) {
                helper.setText("Segue em anexo o relatório");
                helper.addAttachment("Relatório", attachment);
            } else {
                helper.setText("Não foi possível enviar o anexo");
            }
        } else {
            helper.setText("Não foi possível enviar o anexo");
        }
        helper.setSubject("Relatório");
        emailSender.send(message);
    }

    private DataSource convertAttachment(String pdf64) {
        try {
            byte[] pdf = Base64.getDecoder().decode(pdf64);
            return new ByteArrayDataSource(pdf, "application/pdf");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}