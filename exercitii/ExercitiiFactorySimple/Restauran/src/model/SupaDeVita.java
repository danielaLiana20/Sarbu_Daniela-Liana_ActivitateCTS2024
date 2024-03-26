package model;

import java.util.List;

public class SupaDeVita extends Supe{
    public SupaDeVita(int nrIngrediente, List<String> ingrediente) {
        super(nrIngrediente, ingrediente);
    }

    @Override
    public void afisare() {
        System.out.println("Supa de vita contine: "+getNrIngrediente()+ " ingrediente.Acestea sunt: "+getIngrediente());
    }
}
