package model;

public class FabricaMedicamente {

    public Medicamente creareMedicament(TipMedicamente tipMedicamente,String denumire,double pret)
    {
        switch(tipMedicamente){
            case BODY :
                return new Body(denumire,pret);
            case DURERE:
                return new Durere(denumire, pret);
            case RACEALA:
               return new Raceala(denumire, pret);
            default:
                return null;
        }
    }
}
