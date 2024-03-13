package Fabrici;

import Clase.Medic;
import Clase.PersonalSpital;

public class FabricaMedic implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}
