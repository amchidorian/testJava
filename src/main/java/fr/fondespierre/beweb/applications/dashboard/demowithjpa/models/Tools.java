package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import javax.validation.constraints.Null;
import java.util.*;

public class Tools {

    public static Date getDate(Integer day, Integer month, Integer year){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, day);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, year);
        return c.getTime();
    }

    public static HashMap<String,String> addStringHashMap(String value, String key, HashMap<String,String> hm){
        if (hm==null)
            hm = new HashMap<String,String>();
        hm.put(value, key);
        return hm;
    }
}
