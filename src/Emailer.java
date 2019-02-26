import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.*;
import javax.mail.*;
import javax.mail.Multipart;


//Noah
public class Emailer {
	
	private String email;
	private String password;
	//private int totalMessages;
	
	//Class constructor. Sets email and password as well as gets the init total messages in inbox.
	Emailer() {
		email = "exeterschedule@gmail.com";
		password = "Exeter2019";
		//totalMessages = getNumMessages();
	}
	
	//This method sends an email. It requires a argument the recipient, the email subject, and the email body
	public boolean sendEmail(String to, String subject, String message) {	
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
	        return true;
        } 
        
        catch(MessagingException ex) {
        	System.out.println("Email send failed: " + ex);
        	return false;
        }
	}
	/*
	//This method gets the most recent email sent to our exeterschedule email address.  
	public String[] getRecentEmail() {
		Properties props = new Properties();
		//props.put("mail.store.protocol", "pop3");
		props.put("mail.pop3.host", "pop.gmail.com");
		props.put("mail.pop3.port", "995");
		props.put("mail.pop3.starttls.enable", "true");
		Session session = Session.getDefaultInstance(props);
		try {
	        Store holder = session.getStore("pop3s");
	        holder.connect("pop.gmail.com", email, password);
	        Folder f = holder.getFolder("INBOX");
	        f.open(Folder.READ_ONLY);
	        
	        Message[] tmp = f.getMessages();
	        if(tmp.length == 0 | tmp.length == totalMessages) {
	        	return null;
	        }
	        totalMessages++;
	        Message m = tmp[tmp.length-1];
	        
	        String[] returner = new String[3];
	        
	        //System.out.println(m.getContentType());
	        
	        returner[0] = m.getFrom()[0].toString();
	        returner[1] = m.getSubject();
	        if (m.isMimeType("text/plain")) {
	        	returner[2] = (String)m.getContent();
	        }
	        
	        if (m.isMimeType("multipart/*")) {
	        	Multipart mp = (Multipart)m.getContent();
	        	returner[2] = mp.getBodyPart(0).getContent().toString();
	        }
	        
	        return returner;
	        
		} catch(Exception e) {
			System.out.println("Exception: " + e);
			return null;
		}
	}
	
	//This method returns the number of total messages in the inbox. This method is used aso that we can grab only the most recent message in the getRecentEmail method.
	public int getNumMessages() {
		Properties props = new Properties();
		props.put("mail.pop3.host", "pop.gmail.com");
		props.put("mail.pop3.port", "995");
		props.put("mail.pop3.starttls.enable", "true");
		Session session = Session.getDefaultInstance(props);
		try {
	        Store holder = session.getStore("pop3s");
	        holder.connect("pop.gmail.com", email, password);
	        Folder f = holder.getFolder("INBOX");
	        f.open(Folder.READ_ONLY);
	        
	        Message[] tmp = f.getMessages();
	        return tmp.length;
	        
		} catch(Exception e) {
			System.out.println("Exception: " + e);
			return -1;
		}
	}*/
	
}
