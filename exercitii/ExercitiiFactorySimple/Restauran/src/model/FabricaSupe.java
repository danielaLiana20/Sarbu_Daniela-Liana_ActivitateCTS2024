package model;

import java.util.List;

public class FabricaSupe {

    public Supe creareSupe(TipSupe tipSupe, int nrIngrediente, List<String> ingrediente){
        switch (tipSupe){
            case VITA :
                return new SupaDeVita(nrIngrediente, ingrediente);
            case LEGUME:
                return new SupaDeLegume(nrIngrediente, ingrediente);
            case CIUPERCI:
                return new SupaDeCiuperci(nrIngrediente, ingrediente);
            default:
                return null;
        }
    }
}
