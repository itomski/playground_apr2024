package de.lubowiecki.designpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Gruppe extends GeoForm {

    private ArrayList<GeoForm> elemente = new ArrayList();

    @Override
    public void bewegeAn(int x, int y) {

        for(GeoForm gf : elemente) {
            gf.bewegeAn(x, y);
        }
    }

    public void add(GeoForm gf) {
        elemente.add(gf);
    }

    public void add(GeoForm... gf) {
        elemente.addAll(Arrays.asList(gf));
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("Gruppe: ").append("\n");
        for(GeoForm gf : elemente) {
            output.append(gf).append("\n");
        }

        return output.toString();
    }
}
