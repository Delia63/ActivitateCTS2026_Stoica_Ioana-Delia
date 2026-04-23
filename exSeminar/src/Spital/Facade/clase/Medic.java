package Spital.Facade.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean areBiletInternare(Pacient pacient) {
        return pacient.getGravitate() >= 6;
    }
}
