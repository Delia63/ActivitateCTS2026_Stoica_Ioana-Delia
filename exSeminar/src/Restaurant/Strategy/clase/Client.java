package Restaurant.Strategy.clase;

public class Client {
    private String nume;
    private ModalitatePlata strategiePlata;

    public Client(String nume) {
        this.nume = nume;
        this.strategiePlata = new PlataCard();

    }

    public void setStrategiePlata(ModalitatePlata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }

    public void platesteSuma(Double sumaPlata) {
        this.strategiePlata.plateste(this.nume, sumaPlata);
    }
}
