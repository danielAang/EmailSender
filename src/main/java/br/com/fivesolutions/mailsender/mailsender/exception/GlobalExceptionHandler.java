package br.com.fivesolutions.mailsender.mailsender.exception;

import java.util.Date;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.fivesolutions.mailsender.mailsender.entity.CustomError;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MessagingException.class)
    public ResponseEntity<CustomError> messagingException(HttpServletRequest req, MessagingException e) {
        CustomError error = new CustomError(new Date(), "Erro ao enviar email", e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }
    
}