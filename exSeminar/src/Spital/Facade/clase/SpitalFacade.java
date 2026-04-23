package Spital.Facade.clase;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        int nrPat = salon.suntPaturiLibere();

        if(pacient.getGravitate() >= 4)
            if(medic.areBiletInternare(pacient))
                if(nrPat != -1) {
                    System.out.println("Pacientul " + pacient.getNume() + " este internat in patul " + nrPat + ".");
                    salon.ocupaPat(nrPat);
                }
                else
                    System.out.println("Nu sunt paturi libere.");
            else
                System.out.println("Pacientul nu are bilet de internare.");
        else
            System.out.println("Pacientul nu are nevoie de internare.");

    }
}
