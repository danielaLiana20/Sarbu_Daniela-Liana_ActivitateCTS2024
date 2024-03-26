package model;

import java.util.List;

public abstract class Supe {

    private int nrIngrediente;
    private List<String> ingrediente;

    public abstract void afisare();

    public Supe(int nrIngrediente, List<String> ingrediente) {
        this.nrIngrediente = nrIngrediente;
        this.ingrediente = ingrediente;
    }

    public int getNrIngrediente() {
        return nrIngrediente;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }
}
