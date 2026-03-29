package Spital.FactoryMethod.clase;

public abstract class PersonalMedical implements Personal{
    protected int id;
    protected String nume;
    protected String tura;

    public PersonalMedical(int id, String nume, String tura) {
        this.id = id;
        this.nume = nume;
        this.tura = tura;
    }
}
