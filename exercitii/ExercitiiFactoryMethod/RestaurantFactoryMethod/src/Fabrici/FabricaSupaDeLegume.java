package Fabrici;

import Clase.SupaDeLegume;
import Clase.Supe;

import java.util.List;

public class FabricaSupaDeLegume implements FabricaSupe{

    @Override
    public Supe creareSupa(int nrIngrediente, List<String> ingrediente) {
        return new SupaDeLegume(nrIngrediente,ingrediente);
    }
}
