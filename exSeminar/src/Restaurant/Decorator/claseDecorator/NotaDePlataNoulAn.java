package Restaurant.Decorator.claseDecorator;

import Restaurant.Decorator.clase.INotaDePlata;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{

    public NotaDePlataNoulAn(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("La multi ani de Noul An!");
    }
}
