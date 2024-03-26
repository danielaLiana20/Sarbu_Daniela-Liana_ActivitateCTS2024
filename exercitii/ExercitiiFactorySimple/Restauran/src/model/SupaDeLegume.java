package model;

import java.util.List;

public class SupaDeLegume extends Supe{
    public SupaDeLegume(int nrIngrediente, List<String> ingrediente) {
        super(nrIngrediente, ingrediente);
    }

    @Override
    public void afisare() {
        System.out.println("Supa de legume contine: "+getNrIngrediente()+ " ingrediente.Acestea sunt: "+getIngrediente());
    }
}
