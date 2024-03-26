package main;

import model.AbstractBuilder;
import model.Rezervare;

public class Main {
    public static void main(String[] args) {

        AbstractBuilder builder =new Rezervare.RezervareBuilder(62);
        Rezervare rezervare=builder.adaugaAsezareGeam(true).adaugaMuzicaAmbientalaPersonalizata(true,"pop").build();
        System.out.println(rezervare);
    }
}