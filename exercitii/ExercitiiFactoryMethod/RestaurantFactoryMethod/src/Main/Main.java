package Main;

import Clase.Supe;
import Fabrici.FabricaSupaDeCiuperci;
import Fabrici.FabricaSupaDeLegume;
import Fabrici.FabricaSupe;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            FabricaSupe fabricaSupe=new FabricaSupaDeCiuperci();
            procesareSupa(fabricaSupe,2,"ciuperci","apa");
            procesareSupa(new FabricaSupaDeLegume(),2,"legume","apa");

        }

    public static void procesareSupa(FabricaSupe fabrica, int nrIngrediente, String ingredient1,String ingredient2) {
        List<String> ingrediente=new ArrayList<>();
        ingrediente.add(ingredient1);
        ingrediente.add(ingredient2);
        Supe supa= fabrica.creareSupa(nrIngrediente,ingrediente);
        supa.afisare();
    }

}