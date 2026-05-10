package Spital.Decorator.decorator;

import Spital.Decorator.clase.IFisaAnalize;

public class DecoratorFisaAnalizaUrgent extends Decorator{
    public DecoratorFisaAnalizaUrgent(IFisaAnalize fisaAnalize) {
        super(fisaAnalize);
    }

    @Override
    public void printeazaRezultate() {
        super.fisaAnalize.printeazaRezultate();
        System.out.println("Rezultate urgente!");
    }
}
