package STB.Decorator.clase;

public class Bilet implements IBilet{
    private String dataEmitere;
    private double pretBilet;

    public Bilet(String dataEmitere, double pretBilet) {
        this.dataEmitere = dataEmitere;
        this.pretBilet = pretBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Bilet:\n"+"Data emitere: "+this.dataEmitere
                +"\nPret: "+this.pretBilet);
    }
}
