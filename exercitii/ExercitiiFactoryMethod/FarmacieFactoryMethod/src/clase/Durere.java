package clase;

public class Durere extends TipMedicament{
    public Durere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul este pentru durere si se numeste "+getDenumire()+" si costa "+getPret());
    }
}
