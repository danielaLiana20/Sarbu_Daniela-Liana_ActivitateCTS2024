package main;

import model.AbstractBuilder;
import model.Pacient;

public class Main {
    public static void main(String[] args) {

        AbstractBuilder builder=new Pacient.PacientBuilder("Andrei");
        Pacient pacient=builder.adaugaMicDejunInclus(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient);
    }
}