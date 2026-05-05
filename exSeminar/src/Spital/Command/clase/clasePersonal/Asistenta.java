package Spital.Command.clase.clasePersonal;

import Spital.Command.clase.Pacient;

public class Asistenta implements PersonalSpital {
    private String nume;

    public Asistenta(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta "+this.nume+" a preluat pacientul "+pacient.getNume());
    }
}
