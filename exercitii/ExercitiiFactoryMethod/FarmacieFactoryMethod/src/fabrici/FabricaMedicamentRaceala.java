package fabrici;

import clase.Raceala;
import clase.TipMedicament;

public class FabricaMedicamentRaceala implements FabricaMedicamente{
    @Override
    public TipMedicament creareMedicament(String denumire, double pret) {
        return new Raceala(denumire,pret);
    }
}
