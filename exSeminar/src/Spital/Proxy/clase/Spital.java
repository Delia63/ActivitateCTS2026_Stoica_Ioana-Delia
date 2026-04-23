package Spital.Proxy.clase;

public class Spital implements ISpital{
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" este internat in spitalul "+this.numeSpital);
    }
}
