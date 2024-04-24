package main;

import clase.Caracteristici;
import clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        Caracteristici c1=new Caracteristici("Ionel","248548","bucuresti");
        Caracteristici c2=new Caracteristici("Gigel","65484","calarasi");
        Caracteristici c3=new Caracteristici("Marin","000","ilfov");
        Caracteristici c4=new Caracteristici("Ion","78955","constanta");

        fabrica.getPacient(5,4,10).deseneaza(c1);
        fabrica.getPacient(4,2,15).deseneaza(c2);
        fabrica.getPacient(3,1,5).deseneaza(c3);
        fabrica.getPacient(2,6,11).deseneaza(c4);
    }
}