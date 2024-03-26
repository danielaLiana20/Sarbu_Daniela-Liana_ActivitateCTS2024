package model;

public class Raceala extends Medicamente{
    public Raceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul de raceala are denumirea "+getDenumire()+" si pretul "+getPret());

    }
}
