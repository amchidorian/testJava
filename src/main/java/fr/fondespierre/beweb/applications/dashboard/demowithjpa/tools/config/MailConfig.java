package fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools.config;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ConfigClassInterface;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools.Config;
import org.json.simple.JSONObject;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Properties;

final public class MailConfig extends Config implements ConfigClassInterface {

    private STMPConfig stmp;

    private CredentialsConfig cred;

    public MailConfig() throws FileNotFoundException, NoSuchFieldException, IllegalAccessException {
        super();
        this.populateClass(this.getMailConfig());
    }

    public Session getSession(){
        return Session.getInstance(this.getProperties(), this.getCredentials());
    }

    private Properties getProperties() {
        return this.stmp.getProperties();
    }

    private Authenticator getCredentials() {
        return this.cred.getCredentials();
    }

    @Override
    public void populateClass(JSONObject config) throws NoSuchFieldException, IllegalAccessException {
        this.stmp = new STMPConfig((JSONObject) config.get("stmp"));
        this.cred = new CredentialsConfig((JSONObject) config.get("credentials"));
    }

    public String getSender(){
        return this.cred.getUsername();
    }
}

final class STMPConfig implements ConfigClassInterface {

    private String host, port, auth, starttls;

    STMPConfig() {
    }

    STMPConfig(JSONObject config) throws NoSuchFieldException, IllegalAccessException {
        this.populateClass(config);
    }

    @Override
    public void populateClass(JSONObject config) throws NoSuchFieldException, IllegalAccessException {
        for (Object o : config.keySet()) {
            Field field;
            String key = (String) o;
            field = getClass().getDeclaredField(key);
            field.set(this, config.get(key));
        }
    }

    Properties getProperties() {
        Properties p = new Properties();
        p.put("mail.smtp.host", this.host);
        p.put("mail.smtp.port", this.port);
        p.put("mail.smtp.auth", this.auth);
        p.put("mail.smtp.starttls.enable", this.starttls);
        return p;
    }
}

final class CredentialsConfig implements ConfigClassInterface {

    private String username, password;

    public CredentialsConfig() {
    }

    CredentialsConfig(JSONObject config) throws NoSuchFieldException, IllegalAccessException {
        this.populateClass(config);
    }

    @Override
    public void populateClass(JSONObject config) throws NoSuchFieldException, IllegalAccessException {
        for (Object o : config.keySet()) {
            Field field;
            String key = (String) o;
            field = getClass().getDeclaredField(key);
            field.set(this, config.get(key));
        }
    }

    Authenticator getCredentials(){
        PasswordAuthentication pwAuth = new PasswordAuthentication(this.username, this.password);
        return new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return pwAuth;
            }
        };
    }

    String getUsername(){
        return this.username;
    }
}
