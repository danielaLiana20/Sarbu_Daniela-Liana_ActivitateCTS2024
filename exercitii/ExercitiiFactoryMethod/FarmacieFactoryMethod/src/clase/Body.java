package clase;

public class Body extends TipMedicament{
    public Body(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul este pentru body si se numeste "+getDenumire()+" si costa "+getPret());
    }
}
