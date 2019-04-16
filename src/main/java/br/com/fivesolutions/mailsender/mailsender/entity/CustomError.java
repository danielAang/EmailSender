package br.com.fivesolutions.mailsender.mailsender.entity;

import java.util.Date;

/**
 * Error
 */
public class CustomError {

    private Date date;
    private String message;
    private String exceptionMessage;

    public CustomError(Date date, String message, String exceptionMessage) {
        this.date = date;
        this.message = message;
        this.exceptionMessage = exceptionMessage;
    }
    
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the exceptionMessage
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * @param exceptionMessage the exceptionMessage to set
     */
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    
    
}