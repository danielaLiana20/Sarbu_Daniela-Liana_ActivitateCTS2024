package main;

import clase.AchizitieMedicamente;
import clase.AchizitiePeBazaDeReteta;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta=new Reteta(1);
        reteta.adaugaMedicamente("Paracetamol");
        reteta.adaugaMedicamente("Nurofen");

        AchizitieMedicamente achizitie=new AchizitiePeBazaDeReteta(reteta);

        achizitie.achizitioneazaMedicamente();



    }
}