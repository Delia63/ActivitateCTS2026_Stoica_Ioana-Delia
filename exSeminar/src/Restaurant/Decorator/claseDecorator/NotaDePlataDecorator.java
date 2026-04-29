package Restaurant.Decorator.claseDecorator;

import Restaurant.Decorator.clase.INotaDePlata;

public abstract class NotaDePlataDecorator implements INotaDePlata{
    private INotaDePlata notaDePlata;

    public NotaDePlataDecorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    public abstract void printeazaFelicitare();
}
