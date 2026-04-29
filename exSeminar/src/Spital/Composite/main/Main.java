package Spital.Composite.main;

import Spital.Composite.clase.Departament;
import Spital.Composite.clase.Sectia;
import Spital.Composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectiaSecretariat = new Sectia("Secretariat",5);
        Structura sectiaManagement = new Sectia("Management", 10);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectiaManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectiaSecretariat);

        depSpital.afiseazaDetaliiStructura(" ");
        System.out.println("\n");
        depAdministrativ.afiseazaDetaliiStructura(" ");


    }
}
