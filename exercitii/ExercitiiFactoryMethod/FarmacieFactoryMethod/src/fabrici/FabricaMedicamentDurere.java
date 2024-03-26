package fabrici;

import clase.Durere;
import clase.TipMedicament;

public class FabricaMedicamentDurere implements FabricaMedicamente{
    @Override
    public TipMedicament creareMedicament(String denumire, double pret) {
        return new Durere(denumire, pret);
    }
}
