package STB.Strategy.clase;

public class Calator {
    private String nume;
    private ModPlata modPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new CardCalatorii();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteCalatorie() {
        this.modPlata.platesteCalatorie(this.nume);
    }
}
