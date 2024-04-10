package bilete.decoratoare;

import bilete.clase.Bilet;
import bilete.clase.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {

    private BiletAbstract biletAbstract;

    public DecoratorBilet(String echipaGazda, String echipaOaspeti, double pret) {
        super(echipaGazda, echipaOaspeti, pret);
        this.biletAbstract=new Bilet(echipaGazda,echipaOaspeti,pret);
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

    public DecoratorBilet(BiletAbstract biletDecorat) {
        super(biletDecorat.getEchipaGazda(), biletDecorat.getEchipaOaspeti(), biletDecorat.getPret());
        this.biletAbstract=biletDecorat;

    }

    public abstract void aplicaDiscountBilet();
}
