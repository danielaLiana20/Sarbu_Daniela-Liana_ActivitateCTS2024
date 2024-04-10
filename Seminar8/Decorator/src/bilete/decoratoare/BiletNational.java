package bilete.decoratoare;

import bilete.clase.BiletAbstract;

public class BiletNational extends DecoratorBilet{

    private static double valoareDiscount=0.8;
    public BiletNational(String echipaGazda, String echipaOaspeti, double pret) {
        super(echipaGazda, echipaOaspeti, pret);
    }

    public BiletNational(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println(this.getEchipaGazda()+" mult succes!");
    }

    @Override
    public void aplicaDiscountBilet() {
        this.getBiletAbstract().setPret(this.getBiletAbstract().getPret()*valoareDiscount);
    }
}
