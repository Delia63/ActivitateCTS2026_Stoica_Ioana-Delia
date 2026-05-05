package Spital.Command.clase.claseCommand;

import Spital.Command.clase.Pacient;
import Spital.Command.clase.clasePersonal.PersonalSpital;

public class Internare implements Command {
    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
