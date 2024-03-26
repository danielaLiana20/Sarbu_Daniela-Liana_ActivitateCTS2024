package model;

public abstract class Medicamente {

    private String denumire;
    private double pret;

    public abstract void afisare();

    public Medicamente(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
