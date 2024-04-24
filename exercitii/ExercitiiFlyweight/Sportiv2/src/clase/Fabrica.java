package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String,Flyweight> pacienti;

    public Fabrica() {
        this.pacienti = new HashMap<String,Flyweight>();
    }

    public Flyweight getPacient(int nrSalon,int nrPat, int zileSpitalizare) {
        String cheie = String.valueOf(nrSalon) + "_" + String.valueOf(nrPat)+"_"+String.valueOf(zileSpitalizare);

        Flyweight flyweight = pacienti.get(cheie);
        if(flyweight == null) {
            flyweight = new Pacient(nrSalon,nrPat,zileSpitalizare);
            this.pacienti.put(cheie, flyweight);
        }

        return flyweight;
    }
}
