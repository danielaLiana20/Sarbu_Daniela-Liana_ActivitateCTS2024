package main;

import model.FabricaMedicamente;
import model.Medicamente;
import model.TipMedicamente;

public class Main {
    public static void main(String[] args) {

        FabricaMedicamente fabricaMedicamente=new FabricaMedicamente();
        Medicamente raceala=fabricaMedicamente.creareMedicament(TipMedicamente.RACEALA,"Nurofen",28.5);
        raceala.afisare();
        Medicamente durere=fabricaMedicamente.creareMedicament(TipMedicamente.DURERE,"Lioton Gel",22.5);
        durere.afisare();

    }
}