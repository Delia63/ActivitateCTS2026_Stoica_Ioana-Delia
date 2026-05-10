package Structurale.Proxy.agentie.main;

import Structurale.Proxy.agentie.clase.PachetTransport;
import Structurale.Proxy.agentie.clase.PachetTuristic;
import Structurale.Proxy.agentie.clase.Persoana;
import Structurale.Proxy.agentie.clase.ProxyPachet;

public class Main {
    static void main(String[] args) {
        Persoana persoana1 = new Persoana("Ionescu",70);
        PachetTuristic pachetTransport1 = new PachetTransport(persoana1);
        pachetTransport1.descrierePachet();
        pachetTransport1.rezervaPachet();

        ProxyPachet proxyPachet = new ProxyPachet(persoana1);
        proxyPachet.rezervaPachet();
    }
}
