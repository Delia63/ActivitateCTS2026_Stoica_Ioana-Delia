package STB.Decorator.clase;

public class FelicitareAnulNou extends Decorator{
    public FelicitareAnulNou(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeazaBilet();
        System.out.println("La multi ani de Anul Nou!");
    }
}
