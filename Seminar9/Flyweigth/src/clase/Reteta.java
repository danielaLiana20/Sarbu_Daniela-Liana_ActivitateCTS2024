package clase;

public class Reteta {

    private String numeReteta;
    private double sumaPlata;
    private int nrMedicamente;

    public Reteta(String numeReteta, double sumaPlata, int nrMedicamente) {
        this.numeReteta = numeReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public double getSumaPlata() {
        return sumaPlata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeReteta='").append(numeReteta).append('\'');
        sb.append(", sumaPlata=").append(sumaPlata);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
