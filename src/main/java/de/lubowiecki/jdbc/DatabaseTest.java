package de.lubowiecki.jdbc;

import java.sql.*;

public class DatabaseTest {

    private static final String URL = "jdbc:sqlite:data.db";

    public static void main(String[] args) {

        //insertFahrzeug("KI:BV1922", "Peugeot", "206");
        showFahrzeuge();

    }

    private static void showFahrzeuge() {

        try(Connection con = DriverManager.getConnection(URL); Statement stmt = con.createStatement()) {

            final String SQL = "SELECT * FROM fahrzeuge";

            ResultSet results = stmt.executeQuery(SQL);

            while(results.next()) {
                System.out.println(results.getString("kennzeichen")); // Spalte abfragen
                System.out.println(results.getString("marke"));
                System.out.println(results.getString("typ"));
                System.out.println();
            }

            /*
            // Ressourcen werden automatisch geschlossen
            stmt.close();
            con.close();
            */
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void insertFahrzeug(String kennzeichen, String marke, String typ) {

        try(Connection con = DriverManager.getConnection(URL); Statement stmt = con.createStatement()) {

            final String SQL = "INSERT INTO fahrzeuge (kennzeichen, marke, typ) VALUES('%s', '%s', '%s')";

            // TODO: Prüfen, ob das Speichern erfolgreich war
            stmt.executeUpdate(String.format(SQL, kennzeichen, marke, typ));
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
