package de.lubowiecki.local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        // Basename ist der Name der Fallback-Datei inkl. Packages
        ResourceBundle bundle = ResourceBundle.getBundle("de.lubowiecki.local.keys");

        System.out.println(bundle.getString("lbl.welcome"));
        System.out.println(bundle.getString("btn.save"));
        System.out.println(bundle.getString("lbl.end"));
        System.out.println(bundle.getString("lbl.xyz"));

    }
}
