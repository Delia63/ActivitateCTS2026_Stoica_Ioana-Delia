package Spital.Decorator.main;

import Spital.Decorator.clase.FisaAnalize;
import Spital.Decorator.clase.IFisaAnalize;
import Spital.Decorator.decorator.Decorator;
import Spital.Decorator.decorator.DecoratorFisaAnalizaDieta;
import Spital.Decorator.decorator.DecoratorFisaAnalizaUrgent;

public class Main {
    static void main(String[] args) {
        IFisaAnalize fisaAnalize1 = new FisaAnalize("Ionescu",25);
        IFisaAnalize fisaAnalize2 = new FisaAnalize("Popescu",50);
        fisaAnalize1.printeazaRezultate();
        fisaAnalize2.printeazaRezultate();
        System.out.println();

        Decorator decoratorUrgent = new DecoratorFisaAnalizaUrgent(fisaAnalize2);
        Decorator decoratorDieta = new DecoratorFisaAnalizaDieta(fisaAnalize1);
        decoratorUrgent.printeazaRezultate();
        decoratorDieta.printeazaRezultate();
    }
}
