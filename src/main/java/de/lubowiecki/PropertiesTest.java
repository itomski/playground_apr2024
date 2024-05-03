package de.lubowiecki;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties config = new Properties();

        // Lesen von Properties aus Dateien
        try(InputStream in = new FileInputStream("config.properties")) {
            config.load(in); // Informationen aus der Datei werden in das Properties Objekt geladen
            //config.loadFromXML(in); // zum Einlesen von Konfiguration in XML

            System.out.println(config.getProperty("db.host"));
            System.out.println(config.getProperty("db.user"));
            System.out.println(config.getProperty("db.password"));

        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        // Schreiben von Propertes
        config = new Properties(); // Neue Konfiguration
        config.setProperty("sqlite.dbname", "fahrzeuge");
        config.setProperty("sqlite.user", "unbekannt");
        config.setProperty("sqlite.password", "unbekannt");

        try(OutputStream out = new FileOutputStream("config.xml")) {
            //config.store(out, "...");
            config.storeToXML(out, "..."); // Speichert XML Konfigurationen
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
