package Sandesh_Program_Practice.Sandesh_Program_Practice;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.util.Properties;

public class SendEmailTLS {

    public static void main(String[] args) {

        final String username = "hsingh19500@gmail.com";
        final String password = "hsinghsingh";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            // Create a multipar message
            Multipart multipart = new MimeMultipart();
        	
        	
        	Message message = new MimeMessage(session);
            
            
            
            message.setFrom(new InternetAddress("hsingh19500@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("hsingh19500@gmail.com, sindhu.kangondi@gmail.com")
            );
            message.setSubject("Sandesh code test for email");
            message.setText("Dear Sindhu,"
                    + "\n\n Hello!");
            
            
/*            // Part two is attachment
                     message = new MimeBodyPart();
                     String filename = "/home/manisha/file.txt";
                     DataSource source = new FileDataSource(filename);
                     message.setDataHandler(new DataHandler(source));
                     message.setFileName(filename);
                     multipart.addBodyPart(message);*/

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}