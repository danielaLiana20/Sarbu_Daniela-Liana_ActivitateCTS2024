package clase;

public class AchizitiePeBazaDeReteta  extends AchizitieMedicamente{

    Reteta reteta;

    public AchizitiePeBazaDeReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul "+reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for (String medicament: reteta.getListaMedicamente()) {
            if(!(super.stocuri.containsKey(medicament))) {
                System.out.println("Medicamentul "+ medicament+" nu este in stoc.");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele pentru reteta "+reteta.getNrReteta()+" sunt aduse.");
        for (String medicament: reteta.getListaMedicamente()) {
            super.stocuri.replace(medicament,super.stocuri.get(medicament)-1);
        }

        //trebuie sa parcurgem mapul si daca la un medicament avem valoarea mai mica decat 0 trebuie eliminat cu remove
    }

    @Override
    public void incaseaza() {
        System.out.println("Au fost incasati banii pentru reteta "+reteta.getNrReteta());
    }

    @Override
    public void emiteBon() {
        System.out.println("Se emite bonul pentru reteta "+reteta.getNrReteta());
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("Medicamentele din reteta "+reteta.getNrReteta()+" nu sunt disponibile.");
    }
}
