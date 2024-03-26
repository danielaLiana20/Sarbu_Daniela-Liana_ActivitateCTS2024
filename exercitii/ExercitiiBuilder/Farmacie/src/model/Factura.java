package model;

public class Factura {

   private int nrFactura;
   private int numarPungi;
   private boolean plataCard;
   private boolean cardFidelitate;
   private int cotaTVA;

    protected Factura()
    {

    }

    public Factura(int nrFactura, int numarPungi, boolean plataCard, boolean cardFidelitate, int cotaTVA) {
        this.nrFactura = nrFactura;
        this.numarPungi = numarPungi;
        this.plataCard = plataCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setNrFactura(int nrFactura) {
        this.nrFactura = nrFactura;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("nrFactura=").append(nrFactura);
        sb.append(", numarPungi=").append(numarPungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }

    public static class FacturaBuilder implements AbstractBuilder{

      private int nrFactura;
      private int numarPungi;
      private boolean plataCard;
      private boolean cardFidelitate;
      private int cotaTVA;

        public FacturaBuilder(int nrFactura) {
            this.nrFactura = nrFactura;
        }

        @Override
        public AbstractBuilder adaugaNumarPungi(int numarPungi) {
            this.numarPungi=numarPungi;
            return this;
        }

        @Override
        public AbstractBuilder adaugaPlataCuCardul(boolean plataCuCardul) {
            this.plataCard=plataCuCardul;
            return this;
        }

        @Override
        public AbstractBuilder adaugaCardFidelitate(boolean cardFidelitate) {
            this.cardFidelitate=cardFidelitate;
            return this;
        }

        @Override
        public AbstractBuilder adaugaCotaTVA(int cotaTVA) {
            this.cotaTVA=cotaTVA;
            return this;
        }

        @Override
        public Factura build() {
            return new Factura(this.nrFactura,this.numarPungi,this.plataCard,this.cardFidelitate,this.cotaTVA);
        }
    }
}
