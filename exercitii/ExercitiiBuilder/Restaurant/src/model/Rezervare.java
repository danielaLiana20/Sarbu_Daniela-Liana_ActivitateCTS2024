package model;

public class Rezervare {

    private int nrRezervare;

    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String gen;

    protected Rezervare()
    {

    }

    public Rezervare(int nrRezervare, boolean asezareGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaAmbientalaPersonalizata, String gen) {
        this.nrRezervare = nrRezervare;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.gen = gen;
    }

    public void setNrRezervare(int nrRezervare) {
        this.nrRezervare = nrRezervare;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", gen='").append(gen).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements AbstractBuilder{
        private int nrRezervare;

        private boolean asezareGeam;
        private boolean scauneErgonomice;
        private boolean decorMasa;
        private boolean muzicaAmbientalaPersonalizata;
        private String gen;

        public RezervareBuilder(int nrRezervare) {
            this.nrRezervare = nrRezervare;
        }

        @Override
        public AbstractBuilder adaugaAsezareGeam(boolean asezareGeam) {
            this.asezareGeam=asezareGeam;
            return this;
        }

        @Override
        public AbstractBuilder adaugaScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice=scauneErgonomice;
            return this;
        }

        @Override
        public AbstractBuilder adaugaDecorMasa(boolean decorMasa) {
            this.decorMasa=decorMasa;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMuzicaAmbientalaPersonalizata(boolean muzicaAmbientala, String gen) {
            this.muzicaAmbientalaPersonalizata=muzicaAmbientala;
            this.gen=gen;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this.nrRezervare,this.asezareGeam,this.scauneErgonomice,this.decorMasa,this.muzicaAmbientalaPersonalizata,this.gen);
        }
    }
}
