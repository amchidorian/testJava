package fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Config {

    JSONParser jsonParser = new JSONParser();

    JSONObject config = null;

    public Config() throws FileNotFoundException {
        this.setConfig();
    }

    public JSONObject getConfig() {
        return this.config;
    }

    public JSONObject getMailConfig() {
        return (JSONObject) this.config.get("mail");
    }

    public void setConfig() throws FileNotFoundException {
        try {
            this.config = (JSONObject) jsonParser.parse(new FileReader(new File("config.json")));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
