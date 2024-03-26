package main;

import model.AbstractClient;
import model.Client;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Client client1=new Client("Marcel",14, new Date(2024,7,20),12.59);
        AbstractClient client2=client1.cloneaza();
        System.out.println(client1);
        System.out.println(client2);
    }
}