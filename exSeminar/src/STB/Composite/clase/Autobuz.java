package STB.Composite.clase;

public class Autobuz implements Flota{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriere(String spatii) {
        System.out.println(spatii + "Autobuz: Producator - " + this.producator+
                "; Model - " + this.model+"; Nr locuri - " + this.nrLocuri);
    }
}
