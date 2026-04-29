package Restaurant.Decorator.main;

import Restaurant.Decorator.clase.INotaDePlata;
import Restaurant.Decorator.clase.NotaDePlata;
import Restaurant.Decorator.claseDecorator.NotaDePlataDecorator;
import Restaurant.Decorator.claseDecorator.NotaDePlataNoulAn;
import Restaurant.Decorator.claseDecorator.NotaDePlataZiuaMuncii;

public class Main {
    public static void main(String[] args) {
        int input = 1;
        NotaDePlataDecorator notaDePlataDecorator;


        INotaDePlata notaDePlata = new NotaDePlata(120f, "29.04.2026");
        notaDePlata.printeaza();
        System.out.println();

        if (input == 1) {
            notaDePlataDecorator= new NotaDePlataZiuaMuncii(notaDePlata);
            notaDePlataDecorator.printeazaFelicitare();
        }
        else {
            notaDePlataDecorator = new NotaDePlataNoulAn(notaDePlata);
            notaDePlataDecorator.printeazaFelicitare();
        }
    }
}
