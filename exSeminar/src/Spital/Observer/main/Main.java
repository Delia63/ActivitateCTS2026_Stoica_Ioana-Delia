package Spital.Observer.main;

import Spital.Observer.clase.ISpital;
import Spital.Observer.clase.Pacient;
import Spital.Observer.clase.PacientAbonat;
import Spital.Observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Popescu", 35);
        Pacient pacient2 = new PacientAbonat("Ionescu", 50);
        Pacient pacient3 = new PacientAbonat("Vasile", 25);

        ISpital spital = new Spital("Sfanta Maria");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);

        ((Spital) spital).notificaVirus();
        ((Spital) spital).notificaEpidemie();
    }
}
