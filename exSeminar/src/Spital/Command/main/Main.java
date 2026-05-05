package Spital.Command.main;

import Spital.Command.clase.Operator;
import Spital.Command.clase.Pacient;
import Spital.Command.clase.claseCommand.Command;
import Spital.Command.clase.claseCommand.Internare;
import Spital.Command.clase.claseCommand.Tratare;
import Spital.Command.clase.clasePersonal.Asistenta;
import Spital.Command.clase.clasePersonal.Medic;
import Spital.Command.clase.clasePersonal.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Vasile");
        PersonalSpital asistenta = new Asistenta("Loredana");

        Pacient pacient1 = new Pacient("Popescu");
        Pacient pacient2 = new Pacient("Ionescu");

        Command comandaInternare = new Internare(medic, pacient1);
        Command comandaTratare = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(comandaInternare);
        operator.inregistreaza(comandaTratare);
        operator.executaComanda();
        operator.inregistreaza(new Internare(new Medic("Lucas"), new Pacient("Raluca")));
        operator.executaComanda();
        operator.executaComanda();
    }
}
