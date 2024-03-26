package model;

import java.util.List;

public class SupaDeCiuperci extends Supe{
    public SupaDeCiuperci(int nrIngrediente, List<String> ingrediente) {
        super(nrIngrediente, ingrediente);
    }

    @Override
    public void afisare() {
        System.out.println("Supa de ciuperci contine: "+getNrIngrediente()+ " ingrediente.Acestea sunt: "+getIngrediente());
    }
}
