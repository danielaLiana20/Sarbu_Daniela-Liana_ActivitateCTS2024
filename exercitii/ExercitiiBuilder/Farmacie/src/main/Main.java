package main;

import model.AbstractBuilder;
import model.Factura;

public class Main {
    public static void main(String[] args) {

        AbstractBuilder builder=new Factura.FacturaBuilder(15);
        Factura factura=builder.adaugaCardFidelitate(true).adaugaCotaTVA(20).build();
        System.out.println(factura);
    }
}