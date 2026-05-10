package Spital.Flyweight.clase;

public class Pacient implements IPacient{
    private String nume;
    private String nrTelefon;
    private String email;

    public Pacient(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void afisareDatePacient() {
        System.out.println("Pacientul cu numele "+this.nume
                +" are nr de telefon "+this.nrTelefon
                +" si emailul "+this.email);
    }

    @Override
    public void afisareInternarePacient(Internare internare) {
        System.out.println("Pacientul "+this.nume+" este internat in salonul "+internare.getNrSalon()
                +", in patul "+internare.getNrPat() +" pentru "
                +internare.getNrZileInternare()+" zile.");
    }
}
