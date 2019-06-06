package fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.User;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Tools {

    private static EmailSender e;

    static {
        try {
            e = new EmailSender();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (MessagingException e1) {
            e1.printStackTrace();
        }
    }

    private static Tools t;

    private Tools() {
    }

    public static Tools getToolsInstance() {
        if (t == null){
            t = new Tools();
        }
        return t;
    }

    public static void sendEmail(ArrayList<User> receivers, String message, String subject) throws MessagingException, FileNotFoundException, IllegalAccessException, NoSuchFieldException {
        Tools.getToolsInstance();
        e.sendTo(receivers, message, subject);
    }

    public static Date getDate(Integer day, Integer month, Integer year){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, day);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, year);
        return c.getTime();
    }
}
