package Fabrici;

import Clase.SupaDeCiuperci;
import Clase.Supe;

import java.util.List;

public class FabricaSupaDeCiuperci implements FabricaSupe{

    @Override
    public Supe creareSupa(int nrIngrediente, List<String> ingrediente) {
        return new SupaDeCiuperci(nrIngrediente, ingrediente);
    }
}
