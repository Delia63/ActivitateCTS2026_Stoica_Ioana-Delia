package Creationale.FactoryMethod.ex2.clase;

public abstract class Client {
    protected String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public abstract void afisareDetalii();
}
