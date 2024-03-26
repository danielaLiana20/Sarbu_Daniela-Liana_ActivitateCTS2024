package fabrici;

import clase.Body;
import clase.TipMedicament;

public class FabricaMedicamentBody implements FabricaMedicamente{

    @Override
    public TipMedicament creareMedicament(String denumire, double pret) {
        return new Body(denumire,pret);
    }
}
