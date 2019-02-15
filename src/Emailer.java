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
	private String user;
	private String password;
	private String host;
	
	Emailer() {
		email = "";
		user = "";
		password = "";
		host = "";
	}
	
	public void sendEmail(String to, String message) {
		
	}
	
}
