package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools.Tools;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Email {

    private String body;

    private String subject;

    private ArrayList<User> users;

    public Email(String body, String subject, ArrayList<User> users) {
        this.body = body;
        this.subject = subject;
        this.users = users;
    }

    public void sendMail(){
        try {
            fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools.Tools.getToolsInstance();
            Tools.sendEmail(this.getUsers(), this.getBody(), this.getSubject());
        } catch (MessagingException | IllegalAccessException | FileNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
