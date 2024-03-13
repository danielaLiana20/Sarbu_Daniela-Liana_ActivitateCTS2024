package Fabrici;

import Clase.Infirmier;
import Clase.PersonalSpital;

public class FabricaInfirmier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
