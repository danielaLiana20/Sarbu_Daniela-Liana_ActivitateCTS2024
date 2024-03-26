package Fabrici;

import Clase.SupaDeVita;
import Clase.Supe;

import java.util.List;

public class FabricaSupaDeVita implements FabricaSupe {
    @Override
    public Supe creareSupa(int nrIngrediente, List<String> ingrediente) {
        return new SupaDeVita(nrIngrediente, ingrediente);
    }
}
