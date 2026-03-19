package Creationale.Prototype.main;

import Creationale.Prototype.oferte.IListaOferte;
import Creationale.Prototype.oferte.ListaOferte;

public class Main {
    public static void main(String[] args) {
        IListaOferte listaOferte = new ListaOferte();
        listaOferte.incarcaListaOferte();

        IListaOferte copieListaOferte = null;
        copieListaOferte = listaOferte.copiaza();

        System.out.println(copieListaOferte.toString());
    }
}
