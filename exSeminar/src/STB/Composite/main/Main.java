package STB.Composite.main;

import STB.Composite.clase.Autobuz;
import STB.Composite.clase.Flota;
import STB.Composite.clase.Grup;

public class Main {
    static void main(String[] args) {
        Flota grupMic = new Grup("Mic - 10 locuri");
        Flota grupMediu = new Grup("Mediu - 30 locuri");
        Flota grupMare = new Grup("Mare - 50 locuri");

        Flota autobuz1 = new Autobuz("Mercedes", "A1", 10);
        Flota autobuz2 = new Autobuz("Mercedes", "A2", 50);
        Flota autobuz3 = new Autobuz("Mercedes", "A3", 30);
        Flota autobuz4 = new Autobuz("Mercedes", "A4", 50);
        Flota autobuz5 = new Autobuz("Mercedes", "A5", 10);

        ((Grup) grupMic).adaugaAutobuz(autobuz1);
        ((Grup) grupMic).adaugaAutobuz(autobuz5);
        grupMic.descriere("  ");
        System.out.println();

        ((Grup) grupMediu).adaugaAutobuz(autobuz3);
        grupMediu.descriere("  ");
        System.out.println();

        ((Grup) grupMare).adaugaAutobuz(autobuz2);
        ((Grup) grupMare).adaugaAutobuz(autobuz4);
        grupMare.descriere("  ");
        System.out.println();

        ((Grup) grupMic).getAutobuz(0).descriere("  ");
        ((Grup) grupMic).stergeAutobuz(autobuz1);
        grupMic.descriere("  ");



    }
}
