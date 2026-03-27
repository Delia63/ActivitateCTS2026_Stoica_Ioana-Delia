package Creationale.Prototype.curs.main;

import Creationale.Prototype.curs.oferte.IListaOferte;
import Creationale.Prototype.curs.oferte.ListaOferte;

public class Main {
    public static void main(String[] args) {
        IListaOferte listaOferte = new ListaOferte();
        listaOferte.incarcaListaOferte();

        IListaOferte copieListaOferte = null;
        copieListaOferte = listaOferte.copiaza();

        System.out.println(copieListaOferte.toString());
    }
}
