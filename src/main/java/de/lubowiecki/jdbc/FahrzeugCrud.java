package de.lubowiecki.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FahrzeugCrud implements Crud {

    private static final String TABLE = "fahrzeuge";

    public FahrzeugCrud() throws SQLException {
        createTable();
    }

    // Create
    @Override
    public boolean insert(Fahrzeug fahrzeug) throws SQLException {

        try(Connection con = DbUtils.getConnection(); Statement stmt = con.createStatement()) {
            final String SQL = "INSERT INTO " + TABLE + " (kennzeichen, marke, typ) VALUES('%s', '%s', '%s')";
            return stmt.executeUpdate(String.format(SQL,
                                                    fahrzeug.getKennzeichen(),
                                                    fahrzeug.getMarke(),
                                                    fahrzeug.getTyp())) > 0;
        }
    }

    // Update
    @Override
    public boolean update(Fahrzeug fahrzeug) throws SQLException {

        try(Connection con = DbUtils.getConnection(); Statement stmt = con.createStatement()) {

            final String SQL = "UPDATE " + TABLE + " SET kennzeichen = '%s', marke = '%s', typ = '%s' WHERE id = %d";

            return stmt.executeUpdate(String.format(SQL,
                    fahrzeug.getKennzeichen(),
                    fahrzeug.getMarke(),
                    fahrzeug.getTyp(),
                    fahrzeug.getId())) > 0;
        }
    }

    // Delete
    @Override
    public boolean delete(Fahrzeug fahrzeug) throws SQLException {
        return deleteById(fahrzeug.getId());
    }

    @Override
    public boolean deleteById(int id) throws SQLException {

        try(Connection con = DbUtils.getConnection(); Statement stmt = con.createStatement()) {
            final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    // Read
    @Override
    public List<Fahrzeug> findAll() throws SQLException {

        try(Connection con = DbUtils.getConnection(); Statement stmt = con.createStatement()) {

            final String SQL = "SELECT * FROM " + TABLE;
            ResultSet results = stmt.executeQuery(SQL);

            List<Fahrzeug> fahrzeuge = new ArrayList<>();

            while(results.next()) {
                fahrzeuge.add(populate(results));
            }

            return fahrzeuge;
        }
    }

    @Override
    public Fahrzeug findById(int id) throws SQLException {

        try(Connection con = DbUtils.getConnection(); Statement stmt = con.createStatement()) {

            final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

            ResultSet results = stmt.executeQuery(SQL);

            if(results.next()) {
                return populate(results);
            }

            return null;
        }

    }

    @Override
    public Fahrzeug populate(ResultSet result) throws SQLException {
        // Daten aus der DB werden in ein Java-Objekt umgewandelt / Mapping
        Fahrzeug f = new Fahrzeug();
        f.setId(result.getInt("id"));
        f.setKennzeichen(result.getString("kennzeichen"));
        f.setMarke(result.getString("marke"));
        f.setTyp(result.getString("typ"));
        return f;
    }

    @Override
    public void createTable() throws SQLException {

        try(Connection con = DbUtils.getConnection(); Statement stmt = con.createStatement()) {

            final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                                "id INTEGER, " +
                                "kennzeichen TEXT UNIQUE, " +
                                "marke TEXT NOT NULL, " +
                                "typ TEXT NOT NULL, " +
                                "PRIMARY KEY (id AUTOINCREMENT) " +
                                ")";

            stmt.execute(SQL);
        }
    }
}
