package main;

import model.FabricaSupe;
import model.SupaDeCiuperci;
import model.Supe;
import model.TipSupe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FabricaSupe fabricaSupe=new FabricaSupe();
        List<String> ingrediente=new ArrayList<>();
        ingrediente.add("ciuperci");
        ingrediente.add("apa");
        ingrediente.add("sare");
        ingrediente.add("ulei");
        Supe supaDeCiuperci=fabricaSupe.creareSupe(TipSupe.CIUPERCI,4,ingrediente);
        supaDeCiuperci.afisare();
        ingrediente.set(0, "vita");
        Supe supaDeVita=fabricaSupe.creareSupe(TipSupe.VITA,4,ingrediente);
        supaDeVita.afisare();


    }
}