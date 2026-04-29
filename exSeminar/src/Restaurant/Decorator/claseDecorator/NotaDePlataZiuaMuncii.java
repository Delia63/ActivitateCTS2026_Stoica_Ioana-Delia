package Restaurant.Decorator.claseDecorator;

import Restaurant.Decorator.clase.INotaDePlata;

public class NotaDePlataZiuaMuncii extends NotaDePlataDecorator{
    public NotaDePlataZiuaMuncii(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("La multi ani de Ziua Muncii!");
    }
}
