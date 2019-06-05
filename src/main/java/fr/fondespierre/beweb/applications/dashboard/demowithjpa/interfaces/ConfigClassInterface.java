package fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces;

import org.json.simple.JSONObject;

public interface ConfigClassInterface {

    void populateClass(JSONObject config) throws NoSuchFieldException, IllegalAccessException;

}