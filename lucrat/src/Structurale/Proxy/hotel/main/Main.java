package Structurale.Proxy.hotel.main;

import Structurale.Proxy.hotel.clase.IRezervare;
import Structurale.Proxy.hotel.clase.ProxyRezervare;
import Structurale.Proxy.hotel.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1, 1);
        rezervare.anulareRezervare();

        ProxyRezervare proxyRezervare = new ProxyRezervare(rezervare);
        proxyRezervare.anulareRezervare();

    }
}
