package main;

import clase.Flyweight;
import clase.FlyweightFactory;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory fabrica= new FlyweightFactory();
        Reteta reteta1= new Reteta("Reteta1",12,3);
        Reteta reteta2= new Reteta("Reteta2",10,1);
        Reteta reteta3= new Reteta("Reteta3",9,2);
        Reteta reteta4= new Reteta("Reteta4",42,7);
        Reteta reteta5= new Reteta("Reteta5",108,8);

        Flyweight client= fabrica.getClient("1234567","Gigel");
        client.achizitioneazaReteta(reteta1);
        fabrica.getClient("1234567","Gigel").achizitioneazaReteta(reteta3);
        fabrica.getClient("8645321","Ionel").achizitioneazaReteta(reteta5);
        client.achizitioneazaReteta(reteta4);

    }
}