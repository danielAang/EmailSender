package br.com.fivesolutions.mailsender.mailsender.entity;

/**
 * EmailRequest
 */
public class EmailRequest {

    public String email;
    public String pdf64;

    public EmailRequest() {
        
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pdf64
     */
    public String getPdf64() {
        return pdf64;
    }

    /**
     * @param pdf64 the pdf64 to set
     */
    public void setPdf64(String pdf64) {
        this.pdf64 = pdf64;
    }

    
    
}