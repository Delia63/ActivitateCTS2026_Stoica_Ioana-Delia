package test2.Builder.clase;

public class RezervareBuiler implements IRezervareBuilder{
    private boolean cascaProtectie;
    private boolean cosCumparaturi;
    private boolean asigurareAccidente;
    private  int nrKm;

    public RezervareBuiler() {
        this.cascaProtectie = false;
        this.cosCumparaturi = false;
        this.asigurareAccidente = false;
        this.nrKm = 0;
    }

    public RezervareBuiler setCascaProtectie(boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
        return this;
    }

    public RezervareBuiler setCosCumparaturi(boolean cosCumparaturi) {
        this.cosCumparaturi = cosCumparaturi;
        return this;
    }

    public RezervareBuiler setAsigurareAccidente(boolean asigurareAccidente) {
        this.asigurareAccidente = asigurareAccidente;
        return this;
    }

    public RezervareBuiler setNrKm(int nrKm) {
        this.nrKm = nrKm;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.cascaProtectie, this.cosCumparaturi, this.asigurareAccidente, this.nrKm);
    }
}
