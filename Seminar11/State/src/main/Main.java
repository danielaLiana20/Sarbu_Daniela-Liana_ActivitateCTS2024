package main;

import clase.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta=new Reteta(1234,5);
        reteta.cumparaMedicamente();
        reteta.solicitaMedicament();
        reteta.respingeAchizitie();
        reteta.solicitaMedicament();
        reteta.solicitaMedicament();
        reteta.cumparaMedicamente();
    }
}