import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Emailer {
	
	private String email;
	private String password;
	
	Emailer() {
		email = "exeterschedule@gmail.com";
		password = "Exeter2019";
	}
	
	public void sendEmail(String to, String subject, String message) {	
        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                   protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication(email, password);
                   }
        });
        try {
	        Message emailer = new MimeMessage(session);
	        emailer.setFrom(new InternetAddress(email));
	        emailer.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
	        emailer.setSubject(subject);
	        emailer.setText(message);
	        Transport.send(emailer);
	        System.out.println("Success!");
        } 
        
        catch(MessagingException ex) {
        	System.out.println("Email send failed: " + ex);
        }
	}
	
}
