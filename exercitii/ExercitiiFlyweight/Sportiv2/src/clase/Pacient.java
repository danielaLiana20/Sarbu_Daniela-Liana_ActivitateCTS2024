package clase;

public class Pacient implements Flyweight {

    private int nrSalon;
    private int nrPat;
    private int zileInternare;

    public Pacient(int nrSalon, int nrPat, int zileInternare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.zileInternare = zileInternare;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getZileInternare() {
        return zileInternare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", zileInternare=").append(zileInternare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void deseneaza(Caracteristici caracteristici) {
        System.out.println(this.toString()+caracteristici.toString());
    }
}
