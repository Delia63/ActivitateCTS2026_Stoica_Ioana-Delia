package Spital.Decorator.decorator;

import Spital.Decorator.clase.IFisaAnalize;

public class DecoratorFisaAnalizaDieta extends Decorator{
    public DecoratorFisaAnalizaDieta(IFisaAnalize fisaAnalize) {
        super(fisaAnalize);
    }

    @Override
    public void printeazaRezultate() {
        super.fisaAnalize.printeazaRezultate();
        System.out.println("Rezultate pentru dieta!");
    }
}
