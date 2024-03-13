package Fabrici;

import Clase.Asistent;
import Clase.PersonalSpital;

public class FabricaAsistent implements FactoryAngajati{

    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
