package model;

import java.util.Date;

public class Client implements AbstractClient{

    private String nume;
    private int nrRezervare;
    private Date data;
    private double ora;

    public Client(String nume, int nrRezervare, Date data, double ora) {
        this.nume = nume;
        this.nrRezervare = nrRezervare;
        this.data = data;
        if(ora>21.00 || ora<12.00) {
            throw new RuntimeException("Ora incorecta.");
        }
        else
            this.ora=ora;
    }

    private Client(){

    }

    @Override
    public Client cloneaza() {
        Client client=new Client();
        client.nume=this.nume ;
        client.nrRezervare=this.nrRezervare ;
        client.data = this.data;
        client.ora=this.ora;

        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrRezervare=").append(nrRezervare);
        sb.append(", data=").append(data);
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
