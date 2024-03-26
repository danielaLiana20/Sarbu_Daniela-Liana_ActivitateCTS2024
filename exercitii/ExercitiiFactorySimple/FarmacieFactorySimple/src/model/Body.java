package model;

public class Body extends Medicamente{
    public Body(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul de body are denumirea "+getDenumire()+" si pretul "+getPret());
    }
}
