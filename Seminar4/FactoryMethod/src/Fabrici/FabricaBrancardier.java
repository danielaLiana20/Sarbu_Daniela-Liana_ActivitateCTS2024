package Fabrici;

import Clase.Brancardier;
import Clase.PersonalSpital;

public class FabricaBrancardier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
