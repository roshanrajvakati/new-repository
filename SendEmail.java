package email;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail
{
	public static void main(String[] args)
	{
		String to = "robobyme01@gmail.com";
		String from = "ouroffice143@gmail.com";
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", 587);
		
		Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication("ouroffice143@gmail.com","ouroffice@143");
					}
				});
				
		try
		{
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("This is to Test...");
			message.setText("Testing");
			Transport.send(message);
			
			System.out.println("sent message successfully");
			//return true;
		}catch(MessagingException mex)
		{
			mex.printStackTrace();
			//return false;
		}
							
	
}
}