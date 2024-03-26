package model;

public interface AbstractBuilder {

    public abstract AbstractBuilder adaugaAsezareGeam(boolean asezareGeam);
    public abstract  AbstractBuilder adaugaScauneErgonomice(boolean scauneErgonomice);
    public abstract AbstractBuilder adaugaDecorMasa(boolean decorMasa);
    public abstract AbstractBuilder adaugaMuzicaAmbientalaPersonalizata(boolean muzicaAmbientala,String gen);

    public abstract Rezervare build();
}
