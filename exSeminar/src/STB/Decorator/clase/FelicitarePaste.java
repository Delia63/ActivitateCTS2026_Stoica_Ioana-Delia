package STB.Decorator.clase;

public class FelicitarePaste extends Decorator{
    public FelicitarePaste(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeazaBilet();
        System.out.println("Paste fericit!");
    }
}
