package fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tools {
    JSONParser jsonParser = new JSONParser();

    public void getConfig() throws FileNotFoundException {
        try {
            JSONObject config = (JSONObject) jsonParser.parse(new FileReader(new File("../../../src/main/java/fr/fondespierre/beweb/applications/dashboard/demowithjpa/tools/config.json")));
            System.out.println(config);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
