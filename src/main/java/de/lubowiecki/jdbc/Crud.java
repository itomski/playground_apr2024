package de.lubowiecki.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Crud {

    // Alle Methoden in einem Interface sind automatisch public

    // throws SQLException = Aufrufer der Methode muss sich um die Behandlung der Exception selbst kümmern
    boolean insert(Fahrzeug fahrzeug) throws SQLException;

    boolean update(Fahrzeug fahrzeug) throws SQLException;

    boolean delete(Fahrzeug fahrzeug) throws SQLException;

    boolean deleteById(int id) throws SQLException;

    List<Fahrzeug> findAll() throws SQLException;

    Fahrzeug findById(int id) throws SQLException;

    // Wandelt Daten aus der DB in Java-Objekte um
    Fahrzeug populate(ResultSet result) throws SQLException;

    // Baut die DB-Tabelle, wenn noch nicht verfügbar
    void createTable() throws SQLException;

}
