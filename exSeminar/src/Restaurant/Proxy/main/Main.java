package Restaurant.Proxy.main;

import Restaurant.Proxy.clase.IRezervare;
import Restaurant.Proxy.clase.ProxyRezervare;
import Restaurant.Proxy.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, "Popescu",5);
        rezervare1.realizeazaRezervare();

        ProxyRezervare proxyRezervare1 = new ProxyRezervare(rezervare1);
        proxyRezervare1.realizeazaRezervare();

        ProxyRezervare proxyRezervare2 = new ProxyRezervare(new Rezervare(2, "Radu",2));
        proxyRezervare2.realizeazaRezervare();

    }
}
