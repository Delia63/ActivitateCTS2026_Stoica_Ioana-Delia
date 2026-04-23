package Spital.Facade.main;

import Spital.Facade.clase.Medic;
import Spital.Facade.clase.Pacient;
import Spital.Facade.clase.Salon;
import Spital.Facade.clase.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu", 6);
        Medic medic = new Medic("Radu");
        Salon salon = Salon.getInstance();

        int nrPat = salon.suntPaturiLibere();

        if(pacient1.getGravitate() >= 4)
            if(medic.areBiletInternare(pacient1))
                if(nrPat != -1) {
                    System.out.println("Pacientul " + pacient1.getNume() + " este internat in patul " + nrPat + ".");
                    salon.ocupaPat(nrPat);
                }

        SpitalFacade spitalFacade = new SpitalFacade(medic, Salon.getInstance());
        Pacient pacient2 = new Pacient("Mircea",4);
        Pacient pacient3 = new Pacient("Luca",7);
        Pacient pacient4 = new Pacient("Oliver",3);
        spitalFacade.interneazaPacient(pacient2);
        spitalFacade.interneazaPacient(pacient3);
        spitalFacade.interneazaPacient(pacient4);
    }
}
