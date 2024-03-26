package model;

public class Durere extends Medicamente {
    public Durere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul de durere are denumirea "+getDenumire()+" si pretul "+getPret());
    }
}
