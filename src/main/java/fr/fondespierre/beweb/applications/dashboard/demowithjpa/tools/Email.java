package fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Email {
    // propriétés de connexion
    private Properties props = System.getProperties();

    // session de transport des mails
    private Session session;


    public Email() {
        this.props.put("mail.smtp.host", "ssl0.ovh.net");
        this.props.put("mail.smtp.port", "587");
        this.props.put("mail.smtp.auth", "true");
        this.props.put("mail.smtp.starttls.enable", "true");
        // ajout de l'authentification pour la session
        this.session = Session.getInstance(this.props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("inscriptions@fabrique-beweb.com", "kPGsXcij2845sQx");
            }
        });
    }

    /**
     *
     * @param to {@link java.net.InetAddress} adresse de reception du mail
     * @param message {@link String} message à inserer dans le mail
     * @throws MessagingException Si une erreur survient la methode lève une exception
     */
    public void sendTo(InternetAddress to, String message) throws MessagingException{
        // objet Mail
        Message m = new MimeMessage(this.session);
        // corps du message ici en html
        String mp = "<html><head></head><body><div style=\"width: 100%; height: 100%; background-color: red\">\n" +
                "    <h1 style=\"width: 100%; height: 100%; text-align: center\">BONJOUR</h1>\n" +
                "</div>\n</body></html>";

        // Le corps du mail est decoupé en plusieurs parties (MultiPart)
        MimeMultipart mm = new MimeMultipart();
        MimeBodyPart htmlBody = new MimeBodyPart(); // corps du mail pour le html
        htmlBody.setContent(mp,"text/html; charset=utf-8"); // ajout des infos dans le mail
        mm.addBodyPart(htmlBody);
        // Insertion des elements dans le message a envoyer
        m.setFrom(new InternetAddress("inscriptions@fabrique-beweb.com"));
        m.setRecipient(Message.RecipientType.TO, to);
        m.setSubject("mdr regar le cor du mail jsé pa si sa a marchez");
        m.setContent(mm);
        // Envoie du mail
        Transport.send(m);
    }
}
