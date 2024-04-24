package clase;

public class Caracteristici {

    private String nume;
    private String telefon;
    private String adresa;

    public Caracteristici(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caracteristici{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
