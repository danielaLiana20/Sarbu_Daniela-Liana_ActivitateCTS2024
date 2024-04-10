package bilete.clase;

public class Bilet extends BiletAbstract{

    public Bilet(String echipaGazda, String echipaOaspeti, double pret) {
        super(echipaGazda, echipaOaspeti, pret);
    }

    @Override
    public void printareBilet() {
        System.out.println(this.toString());
    }
}
