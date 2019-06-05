package fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Candidature;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.User;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools.config.MailConfig;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Email {

    private MimeMessage mm;

    private MailConfig mc = new MailConfig();

    private MimeBodyPart mb = new MimeBodyPart();

    private MimeMultipart mmp  = new MimeMultipart();

    public Email() throws FileNotFoundException, NoSuchFieldException, IllegalAccessException, MessagingException {
        mm = new MimeMessage(this.mc.getSession());
        mmp.addBodyPart(mb);
    }

    public void sendTo(ArrayList<User> receivers, String message, String subject) throws MessagingException{
        String m = "<html><head></head><body>" . concat(message) . concat("</body></html>");
        mb.setContent(message,"text/html; charset=utf-8");

        mm.setFrom(new InternetAddress(mc.getSender()));
        for (User c : receivers){
            try{
                mm.setRecipient(Message.RecipientType.TO, new InternetAddress(c.getEmail()));
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
        mm.setSubject(subject);
        mm.setContent(mmp);

        Transport.send(mm);
        System.out.println("is sended");
    }
}
