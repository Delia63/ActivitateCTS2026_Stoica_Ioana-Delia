package STB.Decorator.clase;

public abstract class Decorator implements IBilet{
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        this.bilet.printeazaBilet();
    }

    public abstract void printeazaFelicitare();
}
