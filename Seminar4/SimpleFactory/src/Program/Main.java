package Program;

import Clase.FactoryPersonal;
import Clase.PersonalSpital;
import Clase.TipAngajat;

public class Main {
    public static void main(String[] args) {

        FactoryPersonal factoryPersonal=new FactoryPersonal();
        PersonalSpital medic=factoryPersonal.creareAngajat(TipAngajat.MEDIC,"Gigel",12,5);
        medic.afisare();
        PersonalSpital asistent=factoryPersonal.creareAngajat(TipAngajat.ASISTENT,"Ionel",22,0);
        asistent.afisare();

    }
}