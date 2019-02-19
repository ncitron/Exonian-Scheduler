import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Store;

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
	
	public void getNextEmail() {
		Properties props = new Properties();
		props.put("mail.store.protocol", "pop3");
		props.put("mail.pop3.host", "pop.gmail.com");
		props.put("mail.pop3.port", "995");
		props.put("mail.pop3.starttls.enable", "true");
		Session session = Session.getDefaultInstance(props);
		try {
	        Store holder = session.getStore("pop3s");
	        holder.connect("pop.gmail.com", email, password);
	        holder.getFolder("INBOX").open(Folder.READ_ONLY);
	        
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		}
	}
	
}
