package de.lubowiecki.jdbc;

import java.sql.SQLException;

public class CrudTest {

    public static void main(String[] args) {

        try {

            FahrzeugCrud crud = new FahrzeugCrud();

            // FIND ONE
            //Fahrzeug f = crud.findById(2);

            // DELETE
            // crud.deleteById(1);
            // crud.delete(f);

            // INSERT
            Fahrzeug f = new Fahrzeug();
            f.setKennzeichen("AB:PI779");
            f.setMarke("Mercedes");
            f.setTyp("A-Klasse");

            if(crud.insert(f)) {
                System.out.println("Gespeichert!");
            }
            else {
                System.out.println("Konnte nicht gespeichert werden!");
            }

            /*
            // UPDATE
            Fahrzeug f = crud.findById(5);
            f.setTyp("Up");

            if(crud.update(f)) {
                System.out.println("Gespeichert!");
            }
            else {
                System.out.println("Konnte nicht gespeichert werden!");
            }
            */

            // FIND ALL
            for (Fahrzeug f2 : crud.findAll()) {
                System.out.println(f2);
            }
        }
        catch (SQLException ex) {
            //System.out.println("Problem mit der DB");
            ex.printStackTrace();
        }
    }
}
