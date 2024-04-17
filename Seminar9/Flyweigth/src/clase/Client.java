package clase;

public class Client implements Flyweight {
    private String nume;
    private String numarAsigurare;

    public Client(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public void achizitioneazaReteta(Reteta reteta) {
        System.out.println("Clientul "+this.nume+" cu numarul de asigurare "+this.numarAsigurare+" achizitioneaza reteta "+ reteta.toString());
    }
}
