package Restaurant.Command.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupare() {
        System.out.println("Masa cu nr "+this.nrMasa+" a fost ocupata.");
    }
}
