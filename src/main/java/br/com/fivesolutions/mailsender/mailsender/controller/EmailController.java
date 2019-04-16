package br.com.fivesolutions.mailsender.mailsender.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fivesolutions.mailsender.mailsender.entity.EmailRequest;
import br.com.fivesolutions.mailsender.mailsender.service.EmailService;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private EmailService service;

    @GetMapping(value = "send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) throws MessagingException {
        service.sendEmail(emailRequest);
        return ResponseEntity.ok("Email enviado com sucesso!");
    }

}