package Program;

import Clase.PersonalSpital;
import Fabrici.FabricaAsistent;
import Fabrici.FabricaInfirmier;
import Fabrici.FabricaMedic;
import Fabrici.FactoryAngajati;

public class Main {
    public static void main(String[] args) {

        FactoryAngajati factoryAngajati=new FabricaAsistent();
        procesareAngajat(factoryAngajati,"Rares",1000);
        procesareAngajat(new FabricaMedic(),"Alex",1500);
        procesareAngajat(new FabricaInfirmier(),"Florin",2500);

    }

    public static void procesareAngajat(FactoryAngajati factory,String nume,int salariu) {
        PersonalSpital angajat=factory.creareAngajat(nume,salariu);
        angajat.afisare();
    }
}