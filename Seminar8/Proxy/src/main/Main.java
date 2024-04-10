package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet("A","B",10.0);
        Client client=new Client("Popescu",13);
        bilet.vanzareBilet(client);

        BiletAbstract bilet1=new ProxyBilet(bilet);
        bilet1.vanzareBilet(client);

        Client client2=new Client("Gigel",18);
        bilet1.vanzareBilet(client2);


        BiletAbstract bilet3=new ProxyBiletSector(bilet);
        ProxyBiletSector.adaugaLitere('P');
        bilet3.vanzareBilet(client);
        bilet3.vanzareBilet(client2);

        System.out.println("------------------");


        BiletAbstract bilet4=new ProxyBilet(bilet3);
        bilet4.vanzareBilet(client);
        bilet4.vanzareBilet(client2);

    }
}