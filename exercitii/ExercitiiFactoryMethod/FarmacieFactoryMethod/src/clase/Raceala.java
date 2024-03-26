package clase;

public class Raceala extends TipMedicament{

    public Raceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul este pentru raceala si se numeste "+getDenumire()+" si costa "+getPret());
    }
}
