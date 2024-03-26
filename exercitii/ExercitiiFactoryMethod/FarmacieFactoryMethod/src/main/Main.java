package main;

import clase.TipMedicament;
import fabrici.FabricaMedicamentBody;
import fabrici.FabricaMedicamentDurere;
import fabrici.FabricaMedicamentRaceala;
import fabrici.FabricaMedicamente;

public class Main {
    public static void main(String[] args) {

       procesareMedicamente(new FabricaMedicamentBody(),"Fasa elastica",5.50);
       procesareMedicamente(new FabricaMedicamentDurere(),"Lioton Gel",25.50);
       procesareMedicamente(new FabricaMedicamentRaceala(),"Nurofen",28.50);

    }

    public static void procesareMedicamente(FabricaMedicamente fabrica,String denumire,double pret)
    {
        TipMedicament medicament=fabrica.creareMedicament(denumire, pret);
        medicament.afisare();

    }
}