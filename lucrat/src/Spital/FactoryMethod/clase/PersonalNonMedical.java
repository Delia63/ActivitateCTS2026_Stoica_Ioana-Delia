package Spital.FactoryMethod.clase;

public abstract class PersonalNonMedical implements Personal{
    protected int id;
    protected String nume;

    public PersonalNonMedical(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }
}
