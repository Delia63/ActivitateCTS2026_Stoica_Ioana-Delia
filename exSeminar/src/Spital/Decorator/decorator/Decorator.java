package Spital.Decorator.decorator;

import Spital.Decorator.clase.IFisaAnalize;

public abstract class Decorator implements IFisaAnalize {
    IFisaAnalize fisaAnalize;

    public Decorator(IFisaAnalize fisaAnalize) {
        this.fisaAnalize = fisaAnalize;
    }

    @Override
    public abstract void printeazaRezultate();

}
